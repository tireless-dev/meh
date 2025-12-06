// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EventIncident: ImageVector
  get() {
    val current = _eventIncident
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.EventIncident",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="21.0176 26.7217 22.016 28.4541 24.9938 26.7322 24.9938 30.0 26.9907 30.0 26.9907 26.7316 30.0016 28.4727 31.0 26.7402 27.9898 24.9996 30.9902 23.2646 29.9918 21.5322 26.9907 23.2677 26.9907 20.0 24.9938 20.0 24.9938 23.2672 21.9984 21.5352 21.0 23.2676 23.9954 24.9996 21.0176 26.7217" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21.0176 26.7217
          moveTo(x = 21.0176f, y = 26.7217f)
          // L 22.016 28.4541
          lineTo(x = 22.016f, y = 28.4541f)
          // L 24.9938 26.7322
          lineTo(x = 24.9938f, y = 26.7322f)
          // L 24.9938 30
          lineTo(x = 24.9938f, y = 30.0f)
          // L 26.9907 30
          lineTo(x = 26.9907f, y = 30.0f)
          // L 26.9907 26.7316
          lineTo(x = 26.9907f, y = 26.7316f)
          // L 30.0016 28.4727
          lineTo(x = 30.0016f, y = 28.4727f)
          // L 31 26.7402
          lineTo(x = 31.0f, y = 26.7402f)
          // L 27.9898 24.9996
          lineTo(x = 27.9898f, y = 24.9996f)
          // L 30.9902 23.2646
          lineTo(x = 30.9902f, y = 23.2646f)
          // L 29.9918 21.5322
          lineTo(x = 29.9918f, y = 21.5322f)
          // L 26.9907 23.2677
          lineTo(x = 26.9907f, y = 23.2677f)
          // L 26.9907 20
          lineTo(x = 26.9907f, y = 20.0f)
          // L 24.9938 20
          lineTo(x = 24.9938f, y = 20.0f)
          // L 24.9938 23.2672
          lineTo(x = 24.9938f, y = 23.2672f)
          // L 21.9984 21.5352
          lineTo(x = 21.9984f, y = 21.5352f)
          // L 21 23.2676
          lineTo(x = 21.0f, y = 23.2676f)
          // L 23.9954 24.9996
          lineTo(x = 23.9954f, y = 24.9996f)
          // L 21.0176 26.7217z
          lineTo(x = 21.0176f, y = 26.7217f)
          close()
        }
        // M16 23 a1.5 1.5 0 1 0 0 3 1.5 1.5 0 0 0 0 -3
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 23
          moveTo(x = 16.0f, y = 23.0f)
          // a 1.5 1.5 0 1 0 0 3
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 3.0f,
          )
          // a 1.5 1.5 0 0 0 0 -3
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -3.0f,
          )
        }
        // <rect width="2" height="9" x="15.0" y="12.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15 12
          moveTo(x = 15.0f, y = 12.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 9
          verticalLineToRelative(dy = 9.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // M18 30 H3 a1 1 0 0 1 -.89 -1.46 l13 -25 C15.28 3.2 15.64 3 16 3 s.72 .2 .89 .54 l6.76 13 -1.78 .92 L16 6.16 4.65 28 H18z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 30
          moveTo(x = 18.0f, y = 30.0f)
          // H 3
          horizontalLineTo(x = 3.0f)
          // a 1 1 0 0 1 -0.89 -1.46
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.89f,
            dy1 = -1.46f,
          )
          // l 13 -25
          lineToRelative(dx = 13.0f, dy = -25.0f)
          // C 15.28 3.2 15.64 3 16 3
          curveTo(
            x1 = 15.28f,
            y1 = 3.2f,
            x2 = 15.64f,
            y2 = 3.0f,
            x3 = 16.0f,
            y3 = 3.0f,
          )
          // s 0.72 0.2 0.89 0.54
          reflectiveCurveToRelative(
            dx1 = 0.72f,
            dy1 = 0.2f,
            dx2 = 0.89f,
            dy2 = 0.54f,
          )
          // l 6.76 13
          lineToRelative(dx = 6.76f, dy = 13.0f)
          // l -1.78 0.92
          lineToRelative(dx = -1.78f, dy = 0.92f)
          // L 16 6.16
          lineTo(x = 16.0f, y = 6.16f)
          // L 4.65 28
          lineTo(x = 4.65f, y = 28.0f)
          // H 18z
          horizontalLineTo(x = 18.0f)
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
      .also { _eventIncident = it }
  }

@Suppress("ObjectPropertyName")
private var _eventIncident: ImageVector? = null
