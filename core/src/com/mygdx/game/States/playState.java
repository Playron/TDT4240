package com.mygdx.game.States;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class playState extends State {
    private Texture bird;


    protected playState(GameStateManager gsm) {
        super(gsm);
        bird = new Texture("bird.jpeg");
    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(bird, 50,50);
        sb.end();

    }

    @Override
    public void dispose() {

    }
}
