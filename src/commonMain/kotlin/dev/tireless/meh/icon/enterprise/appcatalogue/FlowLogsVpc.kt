// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.appcatalogue

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FlowLogsVpc: ImageVector
  get() {
    val current = _flowLogsVpc
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.FlowLogsVpc",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="12" height="2" x="18.0" y="19.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 19
          moveTo(x = 18.0f, y = 19.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -12z
          horizontalLineToRelative(dx = -12.0f)
          close()
        }
        // <rect width="12" height="2" x="18.0" y="23.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 23
          moveTo(x = 18.0f, y = 23.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -12z
          horizontalLineToRelative(dx = -12.0f)
          close()
        }
        // <rect width="8" height="2" x="18.0" y="27.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 27
          moveTo(x = 18.0f, y = 27.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
          close()
        }
        // M24 4 a4 4 0 0 0 -3.86 3 H12 V4 H4 v8 h8 V9 h8.14 a4 4 0 0 0 .43 1.02 L10.02 20.57 A4 4 0 0 0 8 20 a4 4 0 1 0 3.86 5 H16 v-2 h-4.14 a4 4 0 0 0 -.43 -1.02 l10.55 -10.55 A4 4 0 0 0 24 12 a4 4 0 0 0 0 -8 m-14 6 H6 V6 h4Z M8 26 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2 m16 -16 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 4
          moveTo(x = 24.0f, y = 4.0f)
          // a 4 4 0 0 0 -3.86 3
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.86f,
            dy1 = 3.0f,
          )
          // H 12
          horizontalLineTo(x = 12.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // V 9
          verticalLineTo(y = 9.0f)
          // h 8.14
          horizontalLineToRelative(dx = 8.14f)
          // a 4 4 0 0 0 0.43 1.02
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.43f,
            dy1 = 1.02f,
          )
          // L 10.02 20.57
          lineTo(x = 10.02f, y = 20.57f)
          // A 4 4 0 0 0 8 20
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 8.0f,
            y1 = 20.0f,
          )
          // a 4 4 0 1 0 3.86 5
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 3.86f,
            dy1 = 5.0f,
          )
          // H 16
          horizontalLineTo(x = 16.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -4.14
          horizontalLineToRelative(dx = -4.14f)
          // a 4 4 0 0 0 -0.43 -1.02
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.43f,
            dy1 = -1.02f,
          )
          // l 10.55 -10.55
          lineToRelative(dx = 10.55f, dy = -10.55f)
          // A 4 4 0 0 0 24 12
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 24.0f,
            y1 = 12.0f,
          )
          // a 4 4 0 0 0 0 -8
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -8.0f,
          )
          // m -14 6
          moveToRelative(dx = -14.0f, dy = 6.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
          // M 8 26
          moveTo(x = 8.0f, y = 26.0f)
          // a 2 2 0 1 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // m 16 -16
          moveToRelative(dx = 16.0f, dy = -16.0f)
          // a 2 2 0 1 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
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
      .also { _flowLogsVpc = it }
  }

@Suppress("ObjectPropertyName")
private var _flowLogsVpc: ImageVector? = null
