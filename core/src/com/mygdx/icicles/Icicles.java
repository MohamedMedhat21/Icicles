package com.mygdx.icicles;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.DelayedRemovalArray;
import com.badlogic.gdx.utils.viewport.Viewport;

public class Icicles {
    DelayedRemovalArray<Icicle> icicleArray;
    Viewport viewport;
    int iciclesDodged;
    Constants.Difficulty difficulty;

    public Icicles(Viewport viewport, Constants.Difficulty difficulty) {
        this.viewport = viewport;
        this.difficulty = difficulty;
        init();
    }

    public void init() {
        icicleArray = new DelayedRemovalArray<Icicle>(false, 100);
        iciclesDodged=0;
    }

    public void update(float delta) {
        if (MathUtils.random() < delta * difficulty.spawnRate) {
            Vector2 newIciclePosition = new Vector2(
                    MathUtils.random() * viewport.getWorldWidth(),
                    viewport.getWorldHeight()
            );
            Icicle newIcicle = new Icicle(newIciclePosition);
            icicleArray.add(newIcicle);
        }

        for (Icicle icicle : icicleArray) {
            icicle.update(delta);
        }
        icicleArray.begin();
        for (int i = 0; i < icicleArray.size; i++) {
            if(icicleArray.get(i).position.y< -Constants.ICICLES_HEIGHT){
                icicleArray.removeIndex(i);
                iciclesDodged++;
            }
        }
        icicleArray.end();
    }

    public void render(ShapeRenderer renderer) {
        renderer.setColor(Constants.ICICLE_COLOR);
        for (Icicle icicle : icicleArray) {
            icicle.render(renderer);
        }
    }
}
