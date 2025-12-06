// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ModifiedNewest: ImageVector
  get() {
    val current = _modifiedNewest
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ModifiedNewest",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m19.32 24.7 -4.3 -4.3 V14 h2 v5.6 l3.7 3.7z M16 12 c4.4 0 8 3.6 8 8 s-3.6 8 -8 8 a8 8 0 0 1 .02 -16 M16 10 c-5.5 0 -10.01 4.5 -10.01 10 S10.5 30 16 30 s10 -4.5 10 -10 -4.49 -10 -9.99 -10z m0 -8 -5 6 h10z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19.32 24.7
          moveTo(x = 19.32f, y = 24.7f)
          // l -4.3 -4.3
          lineToRelative(dx = -4.3f, dy = -4.3f)
          // V 14
          verticalLineTo(y = 14.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 5.6
          verticalLineToRelative(dy = 5.6f)
          // l 3.7 3.7z
          lineToRelative(dx = 3.7f, dy = 3.7f)
          close()
          // M 16 12
          moveTo(x = 16.0f, y = 12.0f)
          // c 4.4 0 8 3.6 8 8
          curveToRelative(
            dx1 = 4.4f,
            dy1 = 0.0f,
            dx2 = 8.0f,
            dy2 = 3.6f,
            dx3 = 8.0f,
            dy3 = 8.0f,
          )
          // s -3.6 8 -8 8
          reflectiveCurveToRelative(
            dx1 = -3.6f,
            dy1 = 8.0f,
            dx2 = -8.0f,
            dy2 = 8.0f,
          )
          // a 8 8 0 0 1 0.02 -16
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.02f,
            dy1 = -16.0f,
          )
          // M 16 10
          moveTo(x = 16.0f, y = 10.0f)
          // c -5.5 0 -10.01 4.5 -10.01 10
          curveToRelative(
            dx1 = -5.5f,
            dy1 = 0.0f,
            dx2 = -10.01f,
            dy2 = 4.5f,
            dx3 = -10.01f,
            dy3 = 10.0f,
          )
          // S 10.5 30 16 30
          reflectiveCurveTo(
            x1 = 10.5f,
            y1 = 30.0f,
            x2 = 16.0f,
            y2 = 30.0f,
          )
          // s 10 -4.5 10 -10
          reflectiveCurveToRelative(
            dx1 = 10.0f,
            dy1 = -4.5f,
            dx2 = 10.0f,
            dy2 = -10.0f,
          )
          // s -4.49 -10 -9.99 -10z
          reflectiveCurveToRelative(
            dx1 = -4.49f,
            dy1 = -10.0f,
            dx2 = -9.99f,
            dy2 = -10.0f,
          )
          close()
          // m 0 -8
          moveToRelative(dx = 0.0f, dy = -8.0f)
          // l -5 6
          lineToRelative(dx = -5.0f, dy = 6.0f)
          // h 10z
          horizontalLineToRelative(dx = 10.0f)
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
      .also { _modifiedNewest = it }
  }

@Suppress("ObjectPropertyName")
private var _modifiedNewest: ImageVector? = null
