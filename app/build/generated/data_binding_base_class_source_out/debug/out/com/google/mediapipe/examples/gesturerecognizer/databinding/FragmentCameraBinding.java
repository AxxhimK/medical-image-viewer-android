// Generated by view binder compiler. Do not edit!
package com.google.mediapipe.examples.gesturerecognizer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.view.PreviewView;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.mediapipe.examples.gesturerecognizer.OverlayView;
import com.google.mediapipe.examples.gesturerecognizer.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentCameraBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final InfoBottomSheetBinding bottomSheetLayout;

  @NonNull
  public final CoordinatorLayout cameraContainer;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final CardView imageCard;

  @NonNull
  public final ShapeableImageView imageView;

  @NonNull
  public final CardView miniatureCard;

  @NonNull
  public final ShapeableImageView miniatureImageView;

  @NonNull
  public final OverlayView overlay;

  @NonNull
  public final RecyclerView recyclerviewResults;

  @NonNull
  public final TextView textViewIndex;

  @NonNull
  public final PreviewView viewFinder;

  private FragmentCameraBinding(@NonNull CoordinatorLayout rootView,
      @NonNull InfoBottomSheetBinding bottomSheetLayout, @NonNull CoordinatorLayout cameraContainer,
      @NonNull CardView cardView, @NonNull CardView imageCard,
      @NonNull ShapeableImageView imageView, @NonNull CardView miniatureCard,
      @NonNull ShapeableImageView miniatureImageView, @NonNull OverlayView overlay,
      @NonNull RecyclerView recyclerviewResults, @NonNull TextView textViewIndex,
      @NonNull PreviewView viewFinder) {
    this.rootView = rootView;
    this.bottomSheetLayout = bottomSheetLayout;
    this.cameraContainer = cameraContainer;
    this.cardView = cardView;
    this.imageCard = imageCard;
    this.imageView = imageView;
    this.miniatureCard = miniatureCard;
    this.miniatureImageView = miniatureImageView;
    this.overlay = overlay;
    this.recyclerviewResults = recyclerviewResults;
    this.textViewIndex = textViewIndex;
    this.viewFinder = viewFinder;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCameraBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCameraBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_camera, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCameraBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bottom_sheet_layout;
      View bottomSheetLayout = ViewBindings.findChildViewById(rootView, id);
      if (bottomSheetLayout == null) {
        break missingId;
      }
      InfoBottomSheetBinding binding_bottomSheetLayout = InfoBottomSheetBinding.bind(bottomSheetLayout);

      CoordinatorLayout cameraContainer = (CoordinatorLayout) rootView;

      id = R.id.cardView;
      CardView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.image_card;
      CardView imageCard = ViewBindings.findChildViewById(rootView, id);
      if (imageCard == null) {
        break missingId;
      }

      id = R.id.imageView;
      ShapeableImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.miniatureCard;
      CardView miniatureCard = ViewBindings.findChildViewById(rootView, id);
      if (miniatureCard == null) {
        break missingId;
      }

      id = R.id.miniatureImageView;
      ShapeableImageView miniatureImageView = ViewBindings.findChildViewById(rootView, id);
      if (miniatureImageView == null) {
        break missingId;
      }

      id = R.id.overlay;
      OverlayView overlay = ViewBindings.findChildViewById(rootView, id);
      if (overlay == null) {
        break missingId;
      }

      id = R.id.recyclerview_results;
      RecyclerView recyclerviewResults = ViewBindings.findChildViewById(rootView, id);
      if (recyclerviewResults == null) {
        break missingId;
      }

      id = R.id.textViewIndex;
      TextView textViewIndex = ViewBindings.findChildViewById(rootView, id);
      if (textViewIndex == null) {
        break missingId;
      }

      id = R.id.view_finder;
      PreviewView viewFinder = ViewBindings.findChildViewById(rootView, id);
      if (viewFinder == null) {
        break missingId;
      }

      return new FragmentCameraBinding((CoordinatorLayout) rootView, binding_bottomSheetLayout,
          cameraContainer, cardView, imageCard, imageView, miniatureCard, miniatureImageView,
          overlay, recyclerviewResults, textViewIndex, viewFinder);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
