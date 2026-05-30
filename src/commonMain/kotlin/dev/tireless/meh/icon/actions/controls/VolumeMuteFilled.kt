// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.controls

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VolumeMuteFilled: ImageVector
  get() {
    val current = _volumeMuteFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.VolumeMuteFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="31.0 12.41 29.59 11.0 26.0 14.59 22.41 11.0 21.0 12.41 24.59 16.0 21.0 19.59 22.41 21.0 26.0 17.41 29.59 21.0 31.0 19.59 27.41 16.0 31.0 12.41" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 31 12.41
          moveTo(x = 31.0f, y = 12.41f)
          // L 29.59 11
          lineTo(x = 29.59f, y = 11.0f)
          // L 26 14.59
          lineTo(x = 26.0f, y = 14.59f)
          // L 22.41 11
          lineTo(x = 22.41f, y = 11.0f)
          // L 21 12.41
          lineTo(x = 21.0f, y = 12.41f)
          // L 24.59 16
          lineTo(x = 24.59f, y = 16.0f)
          // L 21 19.59
          lineTo(x = 21.0f, y = 19.59f)
          // L 22.41 21
          lineTo(x = 22.41f, y = 21.0f)
          // L 26 17.41
          lineTo(x = 26.0f, y = 17.41f)
          // L 29.59 21
          lineTo(x = 29.59f, y = 21.0f)
          // L 31 19.59
          lineTo(x = 31.0f, y = 19.59f)
          // L 27.41 16
          lineTo(x = 27.41f, y = 16.0f)
          // L 31 12.41z
          lineTo(x = 31.0f, y = 12.41f)
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
      .also { _volumeMuteFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _volumeMuteFilled: ImageVector? = null
