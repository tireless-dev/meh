// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val IntentRequestUninstall: ImageVector
  get() {
    val current = _intentRequestUninstall
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.IntentRequestUninstall",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="30.0 21.4 28.6 20.0 25.0 23.6 21.4 20.0 20.0 21.4 23.6 25.0 20.0 28.6 21.4 30.0 25.0 26.4 28.6 30.0 30.0 28.6 26.4 25.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 21.4
          moveTo(x = 30.0f, y = 21.4f)
          // L 28.6 20
          lineTo(x = 28.6f, y = 20.0f)
          // L 25 23.6
          lineTo(x = 25.0f, y = 23.6f)
          // L 21.4 20
          lineTo(x = 21.4f, y = 20.0f)
          // L 20 21.4
          lineTo(x = 20.0f, y = 21.4f)
          // L 23.6 25
          lineTo(x = 23.6f, y = 25.0f)
          // L 20 28.6
          lineTo(x = 20.0f, y = 28.6f)
          // L 21.4 30
          lineTo(x = 21.4f, y = 30.0f)
          // L 25 26.4
          lineTo(x = 25.0f, y = 26.4f)
          // L 28.6 30
          lineTo(x = 28.6f, y = 30.0f)
          // L 30 28.6
          lineTo(x = 30.0f, y = 28.6f)
          // L 26.4 25z
          lineTo(x = 26.4f, y = 25.0f)
          close()
        }
        // M15.4 30 5 23.8 c-.6 -.4 -1 -1 -1 -1.7 V9.9 c0 -.7 .4 -1.4 1 -1.7 l10 -5.9 C15.3 2.1 15.6 2 16 2 s.7 .1 1 .3 l10 5.9 c.6 .4 1 1 1 1.7 V16 h-2 V9.9 L16 4 6 9.9 v12.2 l10.5 6.2z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15.4 30
          moveTo(x = 15.4f, y = 30.0f)
          // L 5 23.8
          lineTo(x = 5.0f, y = 23.8f)
          // c -0.6 -0.4 -1 -1 -1 -1.7
          curveToRelative(
            dx1 = -0.6f,
            dy1 = -0.4f,
            dx2 = -1.0f,
            dy2 = -1.0f,
            dx3 = -1.0f,
            dy3 = -1.7f,
          )
          // V 9.9
          verticalLineTo(y = 9.9f)
          // c 0 -0.7 0.4 -1.4 1 -1.7
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.7f,
            dx2 = 0.4f,
            dy2 = -1.4f,
            dx3 = 1.0f,
            dy3 = -1.7f,
          )
          // l 10 -5.9
          lineToRelative(dx = 10.0f, dy = -5.9f)
          // C 15.3 2.1 15.6 2 16 2
          curveTo(
            x1 = 15.3f,
            y1 = 2.1f,
            x2 = 15.6f,
            y2 = 2.0f,
            x3 = 16.0f,
            y3 = 2.0f,
          )
          // s 0.7 0.1 1 0.3
          reflectiveCurveToRelative(
            dx1 = 0.7f,
            dy1 = 0.1f,
            dx2 = 1.0f,
            dy2 = 0.3f,
          )
          // l 10 5.9
          lineToRelative(dx = 10.0f, dy = 5.9f)
          // c 0.6 0.4 1 1 1 1.7
          curveToRelative(
            dx1 = 0.6f,
            dy1 = 0.4f,
            dx2 = 1.0f,
            dy2 = 1.0f,
            dx3 = 1.0f,
            dy3 = 1.7f,
          )
          // V 16
          verticalLineTo(y = 16.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 9.9
          verticalLineTo(y = 9.9f)
          // L 16 4
          lineTo(x = 16.0f, y = 4.0f)
          // L 6 9.9
          lineTo(x = 6.0f, y = 9.9f)
          // v 12.2
          verticalLineToRelative(dy = 12.2f)
          // l 10.5 6.2z
          lineToRelative(dx = 10.5f, dy = 6.2f)
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
      .also { _intentRequestUninstall = it }
  }

@Suppress("ObjectPropertyName")
private var _intentRequestUninstall: ImageVector? = null
