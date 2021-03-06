import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.*;

/**
 * This class runs a world that contains box bugs.
 */
public final class ZBugRunner {
  /**
   * constructs a new runner instance doing nothings
   */
  private ZBugRunner() {
  }

  public static void main(String[] args) {
    ActorWorld world = new ActorWorld();
    ZBug alice = new ZBug(6);
    alice.setColor(Color.ORANGE);
    ZBug bob = new ZBug(3);
    world.add(new Location(7, 8), alice);
    world.add(new Location(5, 5), bob);
    world.show();
  }
}
