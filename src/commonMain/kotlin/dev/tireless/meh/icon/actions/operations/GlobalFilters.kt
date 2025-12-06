// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GlobalFilters: ImageVector
  get() {
    val current = _globalFilters
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.GlobalFilters",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M12.9 7 c-.4 -1.7 -2 -3 -3.9 -3 S5.6 5.3 5.1 7 H2 v2 h3.1 c.4 1.7 2 3 3.9 3 s3.4 -1.3 3.9 -3 H30 V7z M9 10 c-1.1 0 -2 -.9 -2 -2 s.9 -2 2 -2 2 .9 2 2 -.9 2 -2 2 m14 2 c-1.9 0 -3.4 1.3 -3.9 3 H2 v2 h17.1 c.4 1.7 2 3 3.9 3 s3.4 -1.3 3.9 -3 H30 v-2 h-3.1 c-.4 -1.7 -2 -3 -3.9 -3 m0 6 c-1.1 0 -2 -.9 -2 -2 s.9 -2 2 -2 2 .9 2 2 -.9 2 -2 2 m-9 2 c-1.9 0 -3.4 1.3 -3.9 3 H2 v2 h8.1 c.4 1.7 2 3 3.9 3 s3.4 -1.3 3.9 -3 H30 v-2 H17.9 c-.4 -1.7 -2 -3 -3.9 -3 m0 6 c-1.1 0 -2 -.9 -2 -2 s.9 -2 2 -2 2 .9 2 2 -.9 2 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12.9 7
          moveTo(x = 12.9f, y = 7.0f)
          // c -0.4 -1.7 -2 -3 -3.9 -3
          curveToRelative(
            dx1 = -0.4f,
            dy1 = -1.7f,
            dx2 = -2.0f,
            dy2 = -3.0f,
            dx3 = -3.9f,
            dy3 = -3.0f,
          )
          // S 5.6 5.3 5.1 7
          reflectiveCurveTo(
            x1 = 5.6f,
            y1 = 5.3f,
            x2 = 5.1f,
            y2 = 7.0f,
          )
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 3.1
          horizontalLineToRelative(dx = 3.1f)
          // c 0.4 1.7 2 3 3.9 3
          curveToRelative(
            dx1 = 0.4f,
            dy1 = 1.7f,
            dx2 = 2.0f,
            dy2 = 3.0f,
            dx3 = 3.9f,
            dy3 = 3.0f,
          )
          // s 3.4 -1.3 3.9 -3
          reflectiveCurveToRelative(
            dx1 = 3.4f,
            dy1 = -1.3f,
            dx2 = 3.9f,
            dy2 = -3.0f,
          )
          // H 30
          horizontalLineTo(x = 30.0f)
          // V 7z
          verticalLineTo(y = 7.0f)
          close()
          // M 9 10
          moveTo(x = 9.0f, y = 10.0f)
          // c -1.1 0 -2 -0.9 -2 -2
          curveToRelative(
            dx1 = -1.1f,
            dy1 = 0.0f,
            dx2 = -2.0f,
            dy2 = -0.9f,
            dx3 = -2.0f,
            dy3 = -2.0f,
          )
          // s 0.9 -2 2 -2
          reflectiveCurveToRelative(
            dx1 = 0.9f,
            dy1 = -2.0f,
            dx2 = 2.0f,
            dy2 = -2.0f,
          )
          // s 2 0.9 2 2
          reflectiveCurveToRelative(
            dx1 = 2.0f,
            dy1 = 0.9f,
            dx2 = 2.0f,
            dy2 = 2.0f,
          )
          // s -0.9 2 -2 2
          reflectiveCurveToRelative(
            dx1 = -0.9f,
            dy1 = 2.0f,
            dx2 = -2.0f,
            dy2 = 2.0f,
          )
          // m 14 2
          moveToRelative(dx = 14.0f, dy = 2.0f)
          // c -1.9 0 -3.4 1.3 -3.9 3
          curveToRelative(
            dx1 = -1.9f,
            dy1 = 0.0f,
            dx2 = -3.4f,
            dy2 = 1.3f,
            dx3 = -3.9f,
            dy3 = 3.0f,
          )
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 17.1
          horizontalLineToRelative(dx = 17.1f)
          // c 0.4 1.7 2 3 3.9 3
          curveToRelative(
            dx1 = 0.4f,
            dy1 = 1.7f,
            dx2 = 2.0f,
            dy2 = 3.0f,
            dx3 = 3.9f,
            dy3 = 3.0f,
          )
          // s 3.4 -1.3 3.9 -3
          reflectiveCurveToRelative(
            dx1 = 3.4f,
            dy1 = -1.3f,
            dx2 = 3.9f,
            dy2 = -3.0f,
          )
          // H 30
          horizontalLineTo(x = 30.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -3.1
          horizontalLineToRelative(dx = -3.1f)
          // c -0.4 -1.7 -2 -3 -3.9 -3
          curveToRelative(
            dx1 = -0.4f,
            dy1 = -1.7f,
            dx2 = -2.0f,
            dy2 = -3.0f,
            dx3 = -3.9f,
            dy3 = -3.0f,
          )
          // m 0 6
          moveToRelative(dx = 0.0f, dy = 6.0f)
          // c -1.1 0 -2 -0.9 -2 -2
          curveToRelative(
            dx1 = -1.1f,
            dy1 = 0.0f,
            dx2 = -2.0f,
            dy2 = -0.9f,
            dx3 = -2.0f,
            dy3 = -2.0f,
          )
          // s 0.9 -2 2 -2
          reflectiveCurveToRelative(
            dx1 = 0.9f,
            dy1 = -2.0f,
            dx2 = 2.0f,
            dy2 = -2.0f,
          )
          // s 2 0.9 2 2
          reflectiveCurveToRelative(
            dx1 = 2.0f,
            dy1 = 0.9f,
            dx2 = 2.0f,
            dy2 = 2.0f,
          )
          // s -0.9 2 -2 2
          reflectiveCurveToRelative(
            dx1 = -0.9f,
            dy1 = 2.0f,
            dx2 = -2.0f,
            dy2 = 2.0f,
          )
          // m -9 2
          moveToRelative(dx = -9.0f, dy = 2.0f)
          // c -1.9 0 -3.4 1.3 -3.9 3
          curveToRelative(
            dx1 = -1.9f,
            dy1 = 0.0f,
            dx2 = -3.4f,
            dy2 = 1.3f,
            dx3 = -3.9f,
            dy3 = 3.0f,
          )
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 8.1
          horizontalLineToRelative(dx = 8.1f)
          // c 0.4 1.7 2 3 3.9 3
          curveToRelative(
            dx1 = 0.4f,
            dy1 = 1.7f,
            dx2 = 2.0f,
            dy2 = 3.0f,
            dx3 = 3.9f,
            dy3 = 3.0f,
          )
          // s 3.4 -1.3 3.9 -3
          reflectiveCurveToRelative(
            dx1 = 3.4f,
            dy1 = -1.3f,
            dx2 = 3.9f,
            dy2 = -3.0f,
          )
          // H 30
          horizontalLineTo(x = 30.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 17.9
          horizontalLineTo(x = 17.9f)
          // c -0.4 -1.7 -2 -3 -3.9 -3
          curveToRelative(
            dx1 = -0.4f,
            dy1 = -1.7f,
            dx2 = -2.0f,
            dy2 = -3.0f,
            dx3 = -3.9f,
            dy3 = -3.0f,
          )
          // m 0 6
          moveToRelative(dx = 0.0f, dy = 6.0f)
          // c -1.1 0 -2 -0.9 -2 -2
          curveToRelative(
            dx1 = -1.1f,
            dy1 = 0.0f,
            dx2 = -2.0f,
            dy2 = -0.9f,
            dx3 = -2.0f,
            dy3 = -2.0f,
          )
          // s 0.9 -2 2 -2
          reflectiveCurveToRelative(
            dx1 = 0.9f,
            dy1 = -2.0f,
            dx2 = 2.0f,
            dy2 = -2.0f,
          )
          // s 2 0.9 2 2
          reflectiveCurveToRelative(
            dx1 = 2.0f,
            dy1 = 0.9f,
            dx2 = 2.0f,
            dy2 = 2.0f,
          )
          // s -0.9 2 -2 2
          reflectiveCurveToRelative(
            dx1 = -0.9f,
            dy1 = 2.0f,
            dx2 = -2.0f,
          dy2 = 2.0f,
        )
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
      .also { _globalFilters = it }
  }

@Suppress("ObjectPropertyName")
private var _globalFilters: ImageVector? = null
