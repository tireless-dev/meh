// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.appcatalogue

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CloudMonitoring: ImageVector
  get() {
    val current = _cloudMonitoring
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CloudMonitoring",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 16 v6 H4 V6 h7 V4 H4 a2 2 0 0 0 -2 2 v16 a2 2 0 0 0 2 2 h8 v4 H8 v2 h16 v-2 h-4 v-4 h8 a2 2 0 0 0 2 -2 v-6Z M18 28 h-4 v-4 h4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 16
          moveTo(x = 28.0f, y = 16.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 16
          verticalLineToRelative(dy = 16.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // v -6z
          verticalLineToRelative(dy = -6.0f)
          close()
          // M 18 28
          moveTo(x = 18.0f, y = 28.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
        }
        // M18 18 h-.01 a1 1 0 0 1 -.95 -.73 L15.24 11 H11 V9 h5 a1 1 0 0 1 .96 .73 l1.08 3.75 3 -9.77 A1 1 0 0 1 22 3 a1 1 0 0 1 .95 .68 L24.72 9 H30 v2 h-6 a1 1 0 0 1 -.95 -.68 l-1.01 -3.04 -3.08 10.01 A1 1 0 0 1 18 18
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 18
          moveTo(x = 18.0f, y = 18.0f)
          // h -0.01
          horizontalLineToRelative(dx = -0.01f)
          // a 1 1 0 0 1 -0.95 -0.73
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.95f,
            dy1 = -0.73f,
          )
          // L 15.24 11
          lineTo(x = 15.24f, y = 11.0f)
          // H 11
          horizontalLineTo(x = 11.0f)
          // V 9
          verticalLineTo(y = 9.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // a 1 1 0 0 1 0.96 0.73
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.96f,
            dy1 = 0.73f,
          )
          // l 1.08 3.75
          lineToRelative(dx = 1.08f, dy = 3.75f)
          // l 3 -9.77
          lineToRelative(dx = 3.0f, dy = -9.77f)
          // A 1 1 0 0 1 22 3
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 22.0f,
            y1 = 3.0f,
          )
          // a 1 1 0 0 1 0.95 0.68
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.95f,
            dy1 = 0.68f,
          )
          // L 24.72 9
          lineTo(x = 24.72f, y = 9.0f)
          // H 30
          horizontalLineTo(x = 30.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // a 1 1 0 0 1 -0.95 -0.68
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.95f,
            dy1 = -0.68f,
          )
          // l -1.01 -3.04
          lineToRelative(dx = -1.01f, dy = -3.04f)
          // l -3.08 10.01
          lineToRelative(dx = -3.08f, dy = 10.01f)
          // A 1 1 0 0 1 18 18
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 18.0f,
            y1 = 18.0f,
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
      .also { _cloudMonitoring = it }
  }

@Suppress("ObjectPropertyName")
private var _cloudMonitoring: ImageVector? = null
