// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.controls

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VolumeUpFilled: ImageVector
  get() {
    val current = _volumeUpFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.VolumeUpFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m27.16 8.08 -1.53 1.29 a10 10 0 0 1 -.29 13.23 l1.47 1.4 a12 12 0 0 0 .35 -15.88Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27.16 8.08
          moveTo(x = 27.16f, y = 8.08f)
          // l -1.53 1.29
          lineToRelative(dx = -1.53f, dy = 1.29f)
          // a 10 10 0 0 1 -0.29 13.23
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.29f,
            dy1 = 13.23f,
          )
          // l 1.47 1.4
          lineToRelative(dx = 1.47f, dy = 1.4f)
          // a 12 12 0 0 0 0.35 -15.88z
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.35f,
            dy1 = -15.88f,
          )
          close()
        }
        // M21.58 12 a6 6 0 0 1 -.18 7.94 l1.47 1.36 a8 8 0 0 0 .23 -10.59Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21.58 12
          moveTo(x = 21.58f, y = 12.0f)
          // a 6 6 0 0 1 -0.18 7.94
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.18f,
            dy1 = 7.94f,
          )
          // l 1.47 1.36
          lineToRelative(dx = 1.47f, dy = 1.36f)
          // a 8 8 0 0 0 0.23 -10.59z
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.23f,
            dy1 = -10.59f,
          )
          close()
        }
        // M18 30 a1 1 0 0 1 -.71 -.3 L9.67 22 H3 a1 1 0 0 1 -1 -1 V11 a1 1 0 0 1 1 -1 h6.67 l7.62 -7.7 a1 1 0 0 1 1.41 0 A1 1 0 0 1 19 3 v26 a1 1 0 0 1 -1 1
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 30
          moveTo(x = 18.0f, y = 30.0f)
          // a 1 1 0 0 1 -0.71 -0.3
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.71f,
            dy1 = -0.3f,
          )
          // L 9.67 22
          lineTo(x = 9.67f, y = 22.0f)
          // H 3
          horizontalLineTo(x = 3.0f)
          // a 1 1 0 0 1 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // V 11
          verticalLineTo(y = 11.0f)
          // a 1 1 0 0 1 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // h 6.67
          horizontalLineToRelative(dx = 6.67f)
          // l 7.62 -7.7
          lineToRelative(dx = 7.62f, dy = -7.7f)
          // a 1 1 0 0 1 1.41 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.41f,
            dy1 = 0.0f,
          )
          // A 1 1 0 0 1 19 3
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 19.0f,
            y1 = 3.0f,
          )
          // v 26
          verticalLineToRelative(dy = 26.0f)
          // a 1 1 0 0 1 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = 1.0f,
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
      .also { _volumeUpFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _volumeUpFilled: ImageVector? = null
