// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RouterVoice: ImageVector
  get() {
    val current = _routerVoice
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.RouterVoice",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="21.0 25.0 16.0 30.0 11.0 25.0 12.409 23.581 15.0 26.153 15.0 19.0 17.0 19.0 17.0 26.206 19.591 23.581 21.0 25.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 25
          moveTo(x = 21.0f, y = 25.0f)
          // L 16 30
          lineTo(x = 16.0f, y = 30.0f)
          // L 11 25
          lineTo(x = 11.0f, y = 25.0f)
          // L 12.409 23.581
          lineTo(x = 12.409f, y = 23.581f)
          // L 15 26.153
          lineTo(x = 15.0f, y = 26.153f)
          // L 15 19
          lineTo(x = 15.0f, y = 19.0f)
          // L 17 19
          lineTo(x = 17.0f, y = 19.0f)
          // L 17 26.206
          lineTo(x = 17.0f, y = 26.206f)
          // L 19.591 23.581
          lineTo(x = 19.591f, y = 23.581f)
          // L 21 25z
          lineTo(x = 21.0f, y = 25.0f)
          close()
        }
        // <polygon points="24.0 11.0 19.0 16.0 24.0 21.0 25.419 19.591 22.847 17.0 30.0 17.0 30.0 15.0 22.794 15.0 25.419 12.409 24.0 11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 11
          moveTo(x = 24.0f, y = 11.0f)
          // L 19 16
          lineTo(x = 19.0f, y = 16.0f)
          // L 24 21
          lineTo(x = 24.0f, y = 21.0f)
          // L 25.419 19.591
          lineTo(x = 25.419f, y = 19.591f)
          // L 22.847 17
          lineTo(x = 22.847f, y = 17.0f)
          // L 30 17
          lineTo(x = 30.0f, y = 17.0f)
          // L 30 15
          lineTo(x = 30.0f, y = 15.0f)
          // L 22.794 15
          lineTo(x = 22.794f, y = 15.0f)
          // L 25.419 12.409
          lineTo(x = 25.419f, y = 12.409f)
          // L 24 11z
          lineTo(x = 24.0f, y = 11.0f)
          close()
        }
        // <polygon points="8.0 11.0 13.0 16.0 8.0 21.0 6.581 19.591 9.153 17.0 2.0 17.0 2.0 15.0 9.206 15.0 6.581 12.409 8.0 11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 11
          moveTo(x = 8.0f, y = 11.0f)
          // L 13 16
          lineTo(x = 13.0f, y = 16.0f)
          // L 8 21
          lineTo(x = 8.0f, y = 21.0f)
          // L 6.581 19.591
          lineTo(x = 6.581f, y = 19.591f)
          // L 9.153 17
          lineTo(x = 9.153f, y = 17.0f)
          // L 2 17
          lineTo(x = 2.0f, y = 17.0f)
          // L 2 15
          lineTo(x = 2.0f, y = 15.0f)
          // L 9.206 15
          lineTo(x = 9.206f, y = 15.0f)
          // L 6.581 12.409
          lineTo(x = 6.581f, y = 12.409f)
          // L 8 11z
          lineTo(x = 8.0f, y = 11.0f)
          close()
        }
        // M12.43 5.82 v1.63 a1.1 1.1 0 0 1 -.68 1.03 l-1.39 .6 a1.1 1.1 0 0 1 -1.22 -.24 L7.32 7.02 a1.1 1.1 0 0 1 .01 -1.58 l.04 -.03 c7.4 -6.53 14.69 -2.04 17.21 -.05 a1.1 1.1 0 0 1 .18 1.57 l-.1 .1 -1.75 1.76 a1.1 1.1 0 0 1 -1.22 .23 l-1.4 -.6 a1.1 1.1 0 0 1 -.67 -1.02 V5.77 s-3.65 -2.7 -7.2 .05
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12.43 5.82
          moveTo(x = 12.43f, y = 5.82f)
          // v 1.63
          verticalLineToRelative(dy = 1.63f)
          // a 1.1 1.1 0 0 1 -0.68 1.03
          arcToRelative(
            a = 1.1f,
            b = 1.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.68f,
            dy1 = 1.03f,
          )
          // l -1.39 0.6
          lineToRelative(dx = -1.39f, dy = 0.6f)
          // a 1.1 1.1 0 0 1 -1.22 -0.24
          arcToRelative(
            a = 1.1f,
            b = 1.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.22f,
            dy1 = -0.24f,
          )
          // L 7.32 7.02
          lineTo(x = 7.32f, y = 7.02f)
          // a 1.1 1.1 0 0 1 0.01 -1.58
          arcToRelative(
            a = 1.1f,
            b = 1.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.01f,
            dy1 = -1.58f,
          )
          // l 0.04 -0.03
          lineToRelative(dx = 0.04f, dy = -0.03f)
          // c 7.4 -6.53 14.69 -2.04 17.21 -0.05
          curveToRelative(
            dx1 = 7.4f,
            dy1 = -6.53f,
            dx2 = 14.69f,
            dy2 = -2.04f,
            dx3 = 17.21f,
            dy3 = -0.05f,
          )
          // a 1.1 1.1 0 0 1 0.18 1.57
          arcToRelative(
            a = 1.1f,
            b = 1.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.18f,
            dy1 = 1.57f,
          )
          // l -0.1 0.1
          lineToRelative(dx = -0.1f, dy = 0.1f)
          // l -1.75 1.76
          lineToRelative(dx = -1.75f, dy = 1.76f)
          // a 1.1 1.1 0 0 1 -1.22 0.23
          arcToRelative(
            a = 1.1f,
            b = 1.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.22f,
            dy1 = 0.23f,
          )
          // l -1.4 -0.6
          lineToRelative(dx = -1.4f, dy = -0.6f)
          // a 1.1 1.1 0 0 1 -0.67 -1.02
          arcToRelative(
            a = 1.1f,
            b = 1.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.67f,
            dy1 = -1.02f,
          )
          // V 5.77
          verticalLineTo(y = 5.77f)
          // s -3.65 -2.7 -7.2 0.05
          reflectiveCurveToRelative(
            dx1 = -3.65f,
            dy1 = -2.7f,
            dx2 = -7.2f,
            dy2 = 0.05f,
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
      .also { _routerVoice = it }
  }

@Suppress("ObjectPropertyName")
private var _routerVoice: ImageVector? = null
