package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;


import java.awt.Image;

public class MyGdxGame extends ApplicationAdapter {
	private Stage stage;
	private com.badlogic.gdx.scenes.scene2d.ui.Image image;

	Texture texture ;

	@Override
	public void create() {
		stage = new Stage();
		Gdx.input.setInputProcessor(stage);
		texture = new Texture("android/assets/badlogic.jpg");
		image = new com.badlogic.gdx.scenes.scene2d.ui.Image(texture);
		image.addAction(Actions.rotateTo(30,5));
		image.addAction(Actions.moveBy(300,200,5));
		image.addAction(Actions.scaleBy(200,200));

		stage.addActor(image);
	}




	@Override
	public void render() {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stage.act(Gdx.graphics.getDeltaTime());
		stage.draw();
	}

}
