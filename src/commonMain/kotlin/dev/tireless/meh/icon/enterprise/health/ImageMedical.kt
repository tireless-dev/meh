// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.health

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ImageMedical: ImageVector
  get() {
    val current = _imageMedical
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ImageMedical",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 6 v20 H6 V6z m0 -2 H6 a2 2 0 0 0 -2 2 v20 a2 2 0 0 0 2 2 h20 a2 2 0 0 0 2 -2 V6 a2 2 0 0 0 -2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 6
          moveTo(x = 26.0f, y = 6.0f)
          // v 20
          verticalLineToRelative(dy = 20.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 6z
          verticalLineTo(y = 6.0f)
          close()
          // m 0 -2
          moveToRelative(dx = 0.0f, dy = -2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
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
          // v 20
          verticalLineToRelative(dy = 20.0f)
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
          // h 20
          horizontalLineToRelative(dx = 20.0f)
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
          // V 6
          verticalLineTo(y = 6.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
        }
        // <polygon points="22.0 16.0 22.0 14.0 17.0 14.0 17.0 12.0 20.0 12.0 20.0 10.0 17.0 10.0 17.0 8.0 15.0 8.0 15.0 10.0 12.0 10.0 12.0 12.0 15.0 12.0 15.0 14.0 10.0 14.0 10.0 16.0 15.0 16.0 15.0 18.0 10.0 18.0 10.0 20.0 15.0 20.0 15.0 22.0 12.0 22.0 12.0 24.0 20.0 24.0 20.0 22.0 17.0 22.0 17.0 20.0 22.0 20.0 22.0 18.0 17.0 18.0 17.0 16.0 22.0 16.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 16
          moveTo(x = 22.0f, y = 16.0f)
          // L 22 14
          lineTo(x = 22.0f, y = 14.0f)
          // L 17 14
          lineTo(x = 17.0f, y = 14.0f)
          // L 17 12
          lineTo(x = 17.0f, y = 12.0f)
          // L 20 12
          lineTo(x = 20.0f, y = 12.0f)
          // L 20 10
          lineTo(x = 20.0f, y = 10.0f)
          // L 17 10
          lineTo(x = 17.0f, y = 10.0f)
          // L 17 8
          lineTo(x = 17.0f, y = 8.0f)
          // L 15 8
          lineTo(x = 15.0f, y = 8.0f)
          // L 15 10
          lineTo(x = 15.0f, y = 10.0f)
          // L 12 10
          lineTo(x = 12.0f, y = 10.0f)
          // L 12 12
          lineTo(x = 12.0f, y = 12.0f)
          // L 15 12
          lineTo(x = 15.0f, y = 12.0f)
          // L 15 14
          lineTo(x = 15.0f, y = 14.0f)
          // L 10 14
          lineTo(x = 10.0f, y = 14.0f)
          // L 10 16
          lineTo(x = 10.0f, y = 16.0f)
          // L 15 16
          lineTo(x = 15.0f, y = 16.0f)
          // L 15 18
          lineTo(x = 15.0f, y = 18.0f)
          // L 10 18
          lineTo(x = 10.0f, y = 18.0f)
          // L 10 20
          lineTo(x = 10.0f, y = 20.0f)
          // L 15 20
          lineTo(x = 15.0f, y = 20.0f)
          // L 15 22
          lineTo(x = 15.0f, y = 22.0f)
          // L 12 22
          lineTo(x = 12.0f, y = 22.0f)
          // L 12 24
          lineTo(x = 12.0f, y = 24.0f)
          // L 20 24
          lineTo(x = 20.0f, y = 24.0f)
          // L 20 22
          lineTo(x = 20.0f, y = 22.0f)
          // L 17 22
          lineTo(x = 17.0f, y = 22.0f)
          // L 17 20
          lineTo(x = 17.0f, y = 20.0f)
          // L 22 20
          lineTo(x = 22.0f, y = 20.0f)
          // L 22 18
          lineTo(x = 22.0f, y = 18.0f)
          // L 17 18
          lineTo(x = 17.0f, y = 18.0f)
          // L 17 16
          lineTo(x = 17.0f, y = 16.0f)
          // L 22 16z
          lineTo(x = 22.0f, y = 16.0f)
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
      .also { _imageMedical = it }
  }

@Suppress("ObjectPropertyName")
private var _imageMedical: ImageVector? = null
