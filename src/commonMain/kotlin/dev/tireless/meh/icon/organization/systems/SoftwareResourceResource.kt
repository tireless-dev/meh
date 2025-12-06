// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SoftwareResourceResource: ImageVector
  get() {
    val current = _softwareResourceResource
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.SoftwareResourceResource",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="5" height="2" x="6.9" y="8.3" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6.898737 10.282949
          moveTo(x = 6.898737f, y = 10.282949f)
          // l 3.535534 -3.535534
          lineToRelative(dx = 3.535534f, dy = -3.535534f)
          // l 1.4142135 1.4142135
          lineToRelative(dx = 1.4142135f, dy = 1.4142135f)
          // l -3.535534 3.535534z
          lineToRelative(dx = -3.535534f, dy = 3.535534f)
          close()
        }
        // m4.9 19.7 -2.3 -2.3 C2.2 17 2 16.5 2 16 s.2 -1 .6 -1.4 l2.3 -2.3 1.4 1.4 L4 16 l2.3 2.3z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4.9 19.7
          moveTo(x = 4.9f, y = 19.7f)
          // l -2.3 -2.3
          lineToRelative(dx = -2.3f, dy = -2.3f)
          // C 2.2 17 2 16.5 2 16
          curveTo(
            x1 = 2.2f,
            y1 = 17.0f,
            x2 = 2.0f,
            y2 = 16.5f,
            x3 = 2.0f,
            y3 = 16.0f,
          )
          // s 0.2 -1 0.6 -1.4
          reflectiveCurveToRelative(
            dx1 = 0.2f,
            dy1 = -1.0f,
            dx2 = 0.6f,
            dy2 = -1.4f,
          )
          // l 2.3 -2.3
          lineToRelative(dx = 2.3f, dy = -2.3f)
          // l 1.4 1.4
          lineToRelative(dx = 1.4f, dy = 1.4f)
          // L 4 16
          lineTo(x = 4.0f, y = 16.0f)
          // l 2.3 2.3z
          lineToRelative(dx = 2.3f, dy = 2.3f)
          close()
        }
        // <rect width="2" height="5" x="8.3" y="20.3" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6.888836 21.707151
          moveTo(x = 6.888836f, y = 21.707151f)
          // l 1.4142135 -1.4142135
          lineToRelative(dx = 1.4142135f, dy = -1.4142135f)
          // l 3.535534 3.535534
          lineToRelative(dx = 3.535534f, dy = 3.535534f)
          // l -1.4142135 1.4142135z
          lineToRelative(dx = -1.4142135f, dy = 1.4142135f)
          close()
        }
        // M16 30 c-.5 0 -1 -.2 -1.4 -.6 l-2.3 -2.3 1.4 -1.4 L16 28 l2.3 -2.3 1.4 1.4 -2.3 2.3 A2 2 0 0 1 16 30
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 30
          moveTo(x = 16.0f, y = 30.0f)
          // c -0.5 0 -1 -0.2 -1.4 -0.6
          curveToRelative(
            dx1 = -0.5f,
            dy1 = 0.0f,
            dx2 = -1.0f,
            dy2 = -0.2f,
            dx3 = -1.4f,
            dy3 = -0.6f,
          )
          // l -2.3 -2.3
          lineToRelative(dx = -2.3f, dy = -2.3f)
          // l 1.4 -1.4
          lineToRelative(dx = 1.4f, dy = -1.4f)
          // L 16 28
          lineTo(x = 16.0f, y = 28.0f)
          // l 2.3 -2.3
          lineToRelative(dx = 2.3f, dy = -2.3f)
          // l 1.4 1.4
          lineToRelative(dx = 1.4f, dy = 1.4f)
          // l -2.3 2.3
          lineToRelative(dx = -2.3f, dy = 2.3f)
          // A 2 2 0 0 1 16 30
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 30.0f,
          )
        }
        // <rect width="5" height="2" x="20.3" y="21.7" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20.292936 23.69695
          moveTo(x = 20.292936f, y = 23.69695f)
          // l 3.535534 -3.535534
          lineToRelative(dx = 3.535534f, dy = -3.535534f)
          // l 1.4142135 1.4142135
          lineToRelative(dx = 1.4142135f, dy = 1.4142135f)
          // l -3.535534 3.535534z
          lineToRelative(dx = -3.535534f, dy = 3.535534f)
          close()
        }
        // m27.1 19.7 -1.4 -1.4 L28 16 l-2.3 -2.3 1.4 -1.4 2.3 2.3 C29.8 15 30 15.5 30 16 s-.2 1 -.6 1.4z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27.1 19.7
          moveTo(x = 27.1f, y = 19.7f)
          // l -1.4 -1.4
          lineToRelative(dx = -1.4f, dy = -1.4f)
          // L 28 16
          lineTo(x = 28.0f, y = 16.0f)
          // l -2.3 -2.3
          lineToRelative(dx = -2.3f, dy = -2.3f)
          // l 1.4 -1.4
          lineToRelative(dx = 1.4f, dy = -1.4f)
          // l 2.3 2.3
          lineToRelative(dx = 2.3f, dy = 2.3f)
          // C 29.8 15 30 15.5 30 16
          curveTo(
            x1 = 29.8f,
            y1 = 15.0f,
            x2 = 30.0f,
            y2 = 15.5f,
            x3 = 30.0f,
            y3 = 16.0f,
          )
          // s -0.2 1 -0.6 1.4z
          reflectiveCurveToRelative(
            dx1 = -0.2f,
            dy1 = 1.0f,
            dx2 = -0.6f,
            dy2 = 1.4f,
          )
          close()
        }
        // <rect width="2" height="5" x="21.7" y="6.9" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20.30284 8.312951
          moveTo(x = 20.30284f, y = 8.312951f)
          // l 1.4142135 -1.4142135
          lineToRelative(dx = 1.4142135f, dy = -1.4142135f)
          // l 3.535534 3.535534
          lineToRelative(dx = 3.535534f, dy = 3.535534f)
          // l -1.4142135 1.4142135z
          lineToRelative(dx = -1.4142135f, dy = 1.4142135f)
          close()
        }
        // M16 2 c-.5 0 -1 .2 -1.4 .6 l-2.3 2.3 1.4 1.4 L16 4 l2.3 2.3 1.4 -1.4 -2.3 -2.3 A2 2 0 0 0 16 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 2
          moveTo(x = 16.0f, y = 2.0f)
          // c -0.5 0 -1 0.2 -1.4 0.6
          curveToRelative(
            dx1 = -0.5f,
            dy1 = 0.0f,
            dx2 = -1.0f,
            dy2 = 0.2f,
            dx3 = -1.4f,
            dy3 = 0.6f,
          )
          // l -2.3 2.3
          lineToRelative(dx = -2.3f, dy = 2.3f)
          // l 1.4 1.4
          lineToRelative(dx = 1.4f, dy = 1.4f)
          // L 16 4
          lineTo(x = 16.0f, y = 4.0f)
          // l 2.3 2.3
          lineToRelative(dx = 2.3f, dy = 2.3f)
          // l 1.4 -1.4
          lineToRelative(dx = 1.4f, dy = -1.4f)
          // l -2.3 -2.3
          lineToRelative(dx = -2.3f, dy = -2.3f)
          // A 2 2 0 0 0 16 2
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 2.0f,
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
      .also { _softwareResourceResource = it }
  }

@Suppress("ObjectPropertyName")
private var _softwareResourceResource: ImageVector? = null
