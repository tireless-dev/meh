// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CarouselHorizontal: ImageVector
  get() {
    val current = _carouselHorizontal
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CarouselHorizontal",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M22 26 H10 a2 2 0 0 1 -2 -2 V8 a2 2 0 0 1 2 -2 h12 a2 2 0 0 1 2 2 v16 a2 2 0 0 1 -2 2 M10 8 v16 h12 V8Z M4 24 H0 v-2 h4 V10 H0 V8 h4 a2 2 0 0 1 2 2 v12 a2 2 0 0 1 -2 2 m28 0 h-4 a2 2 0 0 1 -2 -2 V10 a2 2 0 0 1 2 -2 h4 v2 h-4 v12 h4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 26
          moveTo(x = 22.0f, y = 26.0f)
          // H 10
          horizontalLineTo(x = 10.0f)
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
          // h 12
          horizontalLineToRelative(dx = 12.0f)
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
          // v 16
          verticalLineToRelative(dy = 16.0f)
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
          // M 10 8
          moveTo(x = 10.0f, y = 8.0f)
          // v 16
          verticalLineToRelative(dy = 16.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // V 8z
          verticalLineTo(y = 8.0f)
          close()
          // M 4 24
          moveTo(x = 4.0f, y = 24.0f)
          // H 0
          horizontalLineTo(x = 0.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // V 10
          verticalLineTo(y = 10.0f)
          // H 0
          horizontalLineTo(x = 0.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
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
          // v 12
          verticalLineToRelative(dy = 12.0f)
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
          // m 28 0
          moveToRelative(dx = 28.0f, dy = 0.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
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
          // V 10
          verticalLineTo(y = 10.0f)
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
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
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
      .also { _carouselHorizontal = it }
  }

@Suppress("ObjectPropertyName")
private var _carouselHorizontal: ImageVector? = null
