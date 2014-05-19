/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.mkonrad.cvaccar;

public class cv_accarJNI {

  static {
    try {
        java.lang.System.loadLibrary("cv_accar");
    } catch (UnsatisfiedLinkError e) {
        java.lang.System.err.println("native code library failed to load.\n" + e);
        java.lang.System.exit(1);
    }
  }

  public final static native void cv_accar_init(int jarg1, long jarg2);
  public final static native void cv_accar_set_dbg_input_frame(long jarg1);
  public final static native void cv_accar_set_dbg_output_mode(int jarg1);
  public final static native void cv_accar_set_dbg_marker_shader(String jarg1, String jarg2);
  public final static native void cv_accar_set_output_display_shader(String jarg1, String jarg2);
  public final static native void cv_accar_add_shader_to_pipeline(String jarg1, String jarg2);
  public final static native void cv_accar_start();
  public final static native void cv_accar_stop();
  public final static native void cv_accar_pause();
  public final static native void cv_accar_resume();
  public final static native void cv_accar_view_create();
  public final static native void cv_accar_view_resize(int jarg1, int jarg2);
  public final static native void cv_accar_view_draw();
  public final static native void cv_accar_get_detected_markers();
  public final static native void cv_accar_cleanup();
}