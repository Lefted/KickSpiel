package us.kickspiel.states;

import java.awt.Graphics;

import us.kickspiel.entitys.Player;
import us.kickspiel.general.Engine;

public class GameState extends State {

	private Player player;
	
	public GameState(Engine engine) {
		super(engine);
		player = new Player(engine, 400, 300);
	}

	@Override
	public void tick() {
		player.tick();
		
		if (player.getPosX() > 800) {
			player.setPosX(-70);
		}
			
	}

	@Override
	public void render(Graphics gfx) {
		player.render(gfx);
	}

}
