// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SearchLocateMirror: ImageVector
  get() {
    val current = _searchLocateMirror
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.SearchLocateMirror",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m21 28.6 -4.7 -4.7 c1.1 -1.4 1.7 -3.1 1.7 -4.9 0 -4.4 -3.6 -8 -8 -8 s-8 3.6 -8 8 3.6 8 8 8 c1.8 0 3.5 -.6 4.9 -1.7 l4.7 4.7z M10 25 c-3.3 0 -6 -2.7 -6 -6 s2.7 -6 6 -6 6 2.7 6 6 -2.7 6 -6 6
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 28.6
          moveTo(x = 21.0f, y = 28.6f)
          // l -4.7 -4.7
          lineToRelative(dx = -4.7f, dy = -4.7f)
          // c 1.1 -1.4 1.7 -3.1 1.7 -4.9
          curveToRelative(
            dx1 = 1.1f,
            dy1 = -1.4f,
            dx2 = 1.7f,
            dy2 = -3.1f,
            dx3 = 1.7f,
            dy3 = -4.9f,
          )
          // c 0 -4.4 -3.6 -8 -8 -8
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -4.4f,
            dx2 = -3.6f,
            dy2 = -8.0f,
            dx3 = -8.0f,
            dy3 = -8.0f,
          )
          // s -8 3.6 -8 8
          reflectiveCurveToRelative(
            dx1 = -8.0f,
            dy1 = 3.6f,
            dx2 = -8.0f,
            dy2 = 8.0f,
          )
          // s 3.6 8 8 8
          reflectiveCurveToRelative(
            dx1 = 3.6f,
            dy1 = 8.0f,
            dx2 = 8.0f,
            dy2 = 8.0f,
          )
          // c 1.8 0 3.5 -0.6 4.9 -1.7
          curveToRelative(
            dx1 = 1.8f,
            dy1 = 0.0f,
            dx2 = 3.5f,
            dy2 = -0.6f,
            dx3 = 4.9f,
            dy3 = -1.7f,
          )
          // l 4.7 4.7z
          lineToRelative(dx = 4.7f, dy = 4.7f)
          close()
          // M 10 25
          moveTo(x = 10.0f, y = 25.0f)
          // c -3.3 0 -6 -2.7 -6 -6
          curveToRelative(
            dx1 = -3.3f,
            dy1 = 0.0f,
            dx2 = -6.0f,
            dy2 = -2.7f,
            dx3 = -6.0f,
            dy3 = -6.0f,
          )
          // s 2.7 -6 6 -6
          reflectiveCurveToRelative(
            dx1 = 2.7f,
            dy1 = -6.0f,
            dx2 = 6.0f,
            dy2 = -6.0f,
          )
          // s 6 2.7 6 6
          reflectiveCurveToRelative(
            dx1 = 6.0f,
            dy1 = 2.7f,
            dx2 = 6.0f,
            dy2 = 6.0f,
          )
          // s -2.7 6 -6 6
          reflectiveCurveToRelative(
            dx1 = -2.7f,
            dy1 = 6.0f,
            dx2 = -6.0f,
            dy2 = 6.0f,
          )
        }
        // <rect width="8" height="2" x="22.0" y="12.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 12
          moveTo(x = 22.0f, y = 12.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
          close()
        }
        // <rect width="16" height="2" x="14.0" y="7.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 7
          moveTo(x = 14.0f, y = 7.0f)
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -16z
          horizontalLineToRelative(dx = -16.0f)
          close()
        }
        // <rect width="16" height="2" x="14.0" y="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 2
          moveTo(x = 14.0f, y = 2.0f)
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -16z
          horizontalLineToRelative(dx = -16.0f)
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 0 0
          moveTo(x = 0.0f, y = 0.0f)
          // h 32
          horizontalLineToRelative(dx = 32.0f)
          // v 32
          verticalLineToRelative(dy = 32.0f)
          // h -32z
          horizontalLineToRelative(dx = -32.0f)
          close()
        }
      }.build()
      .also { _searchLocateMirror = it }
  }

@Suppress("ObjectPropertyName")
private var _searchLocateMirror: ImageVector? = null
