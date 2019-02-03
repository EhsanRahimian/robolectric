package org.robolectric.shadows;

import java.util.concurrent.TimeUnit;

public abstract class ShadowBaseLooper {

  public static boolean useSimplifiedLooper() {
    // TODO: get this from configuration
    return true;
  }

  public abstract void idle();
  public abstract void idleFor(long time, TimeUnit timeUnit);
  public abstract void runPaused(Runnable run);

  public static class Picker extends LooperShadowPicker<ShadowBaseLooper> {

    public Picker() {
      super(ShadowLooper.class, ShadowSimplifiedLooper.class);
    }
  }
}