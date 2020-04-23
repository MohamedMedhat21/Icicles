package com.mygdx.icicles;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Vector2;

public class Constants {
    public static final float WORLD_SIZE = 10.0F;
    public static final float DIFFICULTY_WORLD_SIZE = 480.0f;
    public static final Color BACKGROUND_COLOR = Color.BLACK;

    public static final float ICICLES_HEIGHT = 1.0F;
    public static final float ICICLES_WIDTH = 0.5F;
    public static final Color ICICLE_COLOR = Color.WHITE;

    public static final float PLAYER_HEAD_RADIUS = 0.5F;
    public static final float PLAYER_HEAD_HEIGHT = 4.0F * PLAYER_HEAD_RADIUS;
    public static final float PLAYER_LIMB_WIDTH = 0.1F;
    public static final int PLAYER_HEAD_SEGMENTS = 20;
    public static final Color PLAYER_COLOR = Color.BROWN;
    public static final float PLAYER_MOVEMENT_SPEED = 7.0f;

    public static final float HUD_FONT_REFERENCE_SCREEN_SIZE = 480.0f;
    public static final float HUD_MARGIN = 20.0f;

    public static final String EASY_LABEL = "Easy";
    public static final String MEDIUM_LABEL = "Medium";
    public static final String HARD_LABEL = "Hard";

    public static final Vector2 ICICLES_ACCELERATION = new Vector2(0, -5.0f);
    public static final float EASY_SPAWNS_PER_SECOND = 5.0f;
    public static final float MEDIUM_SPAWNS_PER_SECOND = 10.0f;
    public static final float HARD_SPAWNS_PER_SECOND = 20.0f;

    public static final Color EASY_COLOR = new Color(0.2f, 0.2f, 1, 1);
    public static final Color MEDIUM_COLOR = new Color(0.5f, 0.5f, 1, 1);
    public static final Color HARD_COLOR = new Color(0.7f, 0.7f, 1, 1);

    public static final float DIFFICULTY_BUBBLE_RADIUS = DIFFICULTY_WORLD_SIZE / 9;
    public static final float DIFFICULTY_LABEL_SCALE = 1.5f;
    public static final Vector2 EASY_CENTER = new Vector2(DIFFICULTY_WORLD_SIZE / 4, DIFFICULTY_WORLD_SIZE / 2);
    public static final Vector2 MEDIUM_CENTER = new Vector2(DIFFICULTY_WORLD_SIZE / 2, DIFFICULTY_WORLD_SIZE / 2);
    public static final Vector2 HARD_CENTER = new Vector2(DIFFICULTY_WORLD_SIZE * 3 / 4, DIFFICULTY_WORLD_SIZE / 2);

    public enum Difficulty{
        EASY(EASY_SPAWNS_PER_SECOND,EASY_LABEL),
        MEDIUM(MEDIUM_SPAWNS_PER_SECOND,MEDIUM_LABEL),
        HARD(HARD_SPAWNS_PER_SECOND,HARD_LABEL);

        float spawnRate;
        String label;
        Difficulty(float spawnRate, String label) {
            this.spawnRate = spawnRate;
            this.label = label;
        }

    }
}
