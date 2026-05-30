// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val IntentRequestInactive: ImageVector
  get() {
    val current = _intentRequestInactive
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.IntentRequestInactive",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <circle cx="18.5" cy="22.5" radius="1.5" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18.5 22.5
          moveTo(x = 18.5f, y = 22.5f)
          // m -1.5 0
          moveToRelative(dx = -1.5f, dy = 0.0f)
          // a 1.5 1.5 0 1 1 3 0
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = 0.0f,
          )
          // a 1.5 1.5 0 1 1 -3 0z
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // <circle cx="23.5" cy="22.5" radius="1.5" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23.5 22.5
          moveTo(x = 23.5f, y = 22.5f)
          // m -1.5 0
          moveToRelative(dx = -1.5f, dy = 0.0f)
          // a 1.5 1.5 0 1 1 3 0
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = 0.0f,
          )
          // a 1.5 1.5 0 1 1 -3 0z
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // <circle cx="28.5" cy="22.5" radius="1.5" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28.5 22.5
          moveTo(x = 28.5f, y = 22.5f)
          // m -1.5 0
          moveToRelative(dx = -1.5f, dy = 0.0f)
          // a 1.5 1.5 0 1 1 3 0
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = 0.0f,
          )
          // a 1.5 1.5 0 1 1 -3 0z
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = 0.0f,
          )
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
      .also { _intentRequestInactive = it }
  }

@Suppress("ObjectPropertyName")
private var _intentRequestInactive: ImageVector? = null
