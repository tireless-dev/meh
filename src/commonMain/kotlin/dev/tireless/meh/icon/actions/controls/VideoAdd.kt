// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.controls

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VideoAdd: ImageVector
  get() {
    val current = _videoAdd
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.VideoAdd",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="18.0 15.0 14.0 15.0 14.0 11.0 12.0 11.0 12.0 15.0 8.0 15.0 8.0 17.0 12.0 17.0 12.0 21.0 14.0 21.0 14.0 17.0 18.0 17.0 18.0 15.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 15
          moveTo(x = 18.0f, y = 15.0f)
          // L 14 15
          lineTo(x = 14.0f, y = 15.0f)
          // L 14 11
          lineTo(x = 14.0f, y = 11.0f)
          // L 12 11
          lineTo(x = 12.0f, y = 11.0f)
          // L 12 15
          lineTo(x = 12.0f, y = 15.0f)
          // L 8 15
          lineTo(x = 8.0f, y = 15.0f)
          // L 8 17
          lineTo(x = 8.0f, y = 17.0f)
          // L 12 17
          lineTo(x = 12.0f, y = 17.0f)
          // L 12 21
          lineTo(x = 12.0f, y = 21.0f)
          // L 14 21
          lineTo(x = 14.0f, y = 21.0f)
          // L 14 17
          lineTo(x = 14.0f, y = 17.0f)
          // L 18 17
          lineTo(x = 18.0f, y = 17.0f)
          // L 18 15z
          lineTo(x = 18.0f, y = 15.0f)
          close()
        }
        // M21 26 H4 a2 2 0 0 1 -2 -2 V8 a2 2 0 0 1 2 -2 h17 a2 2 0 0 1 2 2 v4.06 l5.42 -3.87 A1 1 0 0 1 30 9 v14 a1 1 0 0 1 -1.58 .81 L23 19.94 V24 a2 2 0 0 1 -2 2 M4 8 v16 h17 v-6 a1 1 0 0 1 1.58 -.81 L28 21.06 V10.94 l-5.42 3.87 A1 1 0 0 1 21 14 V8Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 26
          moveTo(x = 21.0f, y = 26.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // a 2 2 0 0 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // V 8
          verticalLineTo(y = 8.0f)
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // h 17
          horizontalLineToRelative(dx = 17.0f)
          // a 2 2 0 0 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // v 4.06
          verticalLineToRelative(dy = 4.06f)
          // l 5.42 -3.87
          lineToRelative(dx = 5.42f, dy = -3.87f)
          // A 1 1 0 0 1 30 9
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 30.0f,
            y1 = 9.0f,
          )
          // v 14
          verticalLineToRelative(dy = 14.0f)
          // a 1 1 0 0 1 -1.58 0.81
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.58f,
            dy1 = 0.81f,
          )
          // L 23 19.94
          lineTo(x = 23.0f, y = 19.94f)
          // V 24
          verticalLineTo(y = 24.0f)
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
          // M 4 8
          moveTo(x = 4.0f, y = 8.0f)
          // v 16
          verticalLineToRelative(dy = 16.0f)
          // h 17
          horizontalLineToRelative(dx = 17.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // a 1 1 0 0 1 1.58 -0.81
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.58f,
            dy1 = -0.81f,
          )
          // L 28 21.06
          lineTo(x = 28.0f, y = 21.06f)
          // V 10.94
          verticalLineTo(y = 10.94f)
          // l -5.42 3.87
          lineToRelative(dx = -5.42f, dy = 3.87f)
          // A 1 1 0 0 1 21 14
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 21.0f,
            y1 = 14.0f,
          )
          // V 8z
          verticalLineTo(y = 8.0f)
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
      .also { _videoAdd = it }
  }

@Suppress("ObjectPropertyName")
private var _videoAdd: ImageVector? = null
