// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BluetoothOff: ImageVector
  get() {
    val current = _bluetoothOff
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.BluetoothOff",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 26.59 5.41 4 4 5.41 14.59 16 7 23.59 8.41 25 15 18.41 V29 a1 1 0 0 0 .58 .91 A1 1 0 0 0 16 30 a1 1 0 0 0 .65 -.24 l6.3 -5.4 L26.59 28Z m-11 .24 v-8.42 l4.53 4.53Z m0 -14.08 V5.17 l4.53 3.89 -4.11 4.11 1.41 1.41 4.88 -4.87 A1 1 0 0 0 24 9 a1 1 0 0 0 -.35 -.72 l-7 -6 a1 1 0 0 0 -1.07 -.15 A1 1 0 0 0 15 3 v7.75Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 26.59
          moveTo(x = 28.0f, y = 26.59f)
          // L 5.41 4
          lineTo(x = 5.41f, y = 4.0f)
          // L 4 5.41
          lineTo(x = 4.0f, y = 5.41f)
          // L 14.59 16
          lineTo(x = 14.59f, y = 16.0f)
          // L 7 23.59
          lineTo(x = 7.0f, y = 23.59f)
          // L 8.41 25
          lineTo(x = 8.41f, y = 25.0f)
          // L 15 18.41
          lineTo(x = 15.0f, y = 18.41f)
          // V 29
          verticalLineTo(y = 29.0f)
          // a 1 1 0 0 0 0.58 0.91
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.58f,
            dy1 = 0.91f,
          )
          // A 1 1 0 0 0 16 30
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 30.0f,
          )
          // a 1 1 0 0 0 0.65 -0.24
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.65f,
            dy1 = -0.24f,
          )
          // l 6.3 -5.4
          lineToRelative(dx = 6.3f, dy = -5.4f)
          // L 26.59 28z
          lineTo(x = 26.59f, y = 28.0f)
          close()
          // m -11 0.24
          moveToRelative(dx = -11.0f, dy = 0.24f)
          // v -8.42
          verticalLineToRelative(dy = -8.42f)
          // l 4.53 4.53z
          lineToRelative(dx = 4.53f, dy = 4.53f)
          close()
          // m 0 -14.08
          moveToRelative(dx = 0.0f, dy = -14.08f)
          // V 5.17
          verticalLineTo(y = 5.17f)
          // l 4.53 3.89
          lineToRelative(dx = 4.53f, dy = 3.89f)
          // l -4.11 4.11
          lineToRelative(dx = -4.11f, dy = 4.11f)
          // l 1.41 1.41
          lineToRelative(dx = 1.41f, dy = 1.41f)
          // l 4.88 -4.87
          lineToRelative(dx = 4.88f, dy = -4.87f)
          // A 1 1 0 0 0 24 9
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 24.0f,
            y1 = 9.0f,
          )
          // a 1 1 0 0 0 -0.35 -0.72
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.35f,
            dy1 = -0.72f,
          )
          // l -7 -6
          lineToRelative(dx = -7.0f, dy = -6.0f)
          // a 1 1 0 0 0 -1.07 -0.15
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.07f,
            dy1 = -0.15f,
          )
          // A 1 1 0 0 0 15 3
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 15.0f,
            y1 = 3.0f,
          )
          // v 7.75z
          verticalLineToRelative(dy = 7.75f)
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
      .also { _bluetoothOff = it }
  }

@Suppress("ObjectPropertyName")
private var _bluetoothOff: ImageVector? = null
