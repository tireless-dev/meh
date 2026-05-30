// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.controls

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VolumeUpFilledAlt: ImageVector
  get() {
    val current = _volumeUpFilledAlt
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.VolumeUpFilledAlt",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="32.0 15.0 28.0 15.0 28.0 11.0 26.0 11.0 26.0 15.0 22.0 15.0 22.0 17.0 26.0 17.0 26.0 21.0 28.0 21.0 28.0 17.0 32.0 17.0 32.0 15.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 32 15
          moveTo(x = 32.0f, y = 15.0f)
          // L 28 15
          lineTo(x = 28.0f, y = 15.0f)
          // L 28 11
          lineTo(x = 28.0f, y = 11.0f)
          // L 26 11
          lineTo(x = 26.0f, y = 11.0f)
          // L 26 15
          lineTo(x = 26.0f, y = 15.0f)
          // L 22 15
          lineTo(x = 22.0f, y = 15.0f)
          // L 22 17
          lineTo(x = 22.0f, y = 17.0f)
          // L 26 17
          lineTo(x = 26.0f, y = 17.0f)
          // L 26 21
          lineTo(x = 26.0f, y = 21.0f)
          // L 28 21
          lineTo(x = 28.0f, y = 21.0f)
          // L 28 17
          lineTo(x = 28.0f, y = 17.0f)
          // L 32 17
          lineTo(x = 32.0f, y = 17.0f)
          // L 32 15z
          lineTo(x = 32.0f, y = 15.0f)
          close()
        }
        // M18 30 a1 1 0 0 1 -.71 -.3 L9.67 22 H3 a1 1 0 0 1 -1 -1 V11 a1 1 0 0 1 1 -1 h6.67 l7.62 -7.7 A1 1 0 0 1 19 3 v26 a1 1 0 0 1 -1 1
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
      .also { _volumeUpFilledAlt = it }
  }

@Suppress("ObjectPropertyName")
private var _volumeUpFilledAlt: ImageVector? = null
