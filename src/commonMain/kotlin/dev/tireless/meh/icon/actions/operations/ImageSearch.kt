// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ImageSearch: ImageVector
  get() {
    val current = _imageSearch
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ImageSearch",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M24 14 a5.99 5.99 0 0 0 -4.88 9.47 L14 28.6 15.41 30 l5.12 -5.11 A6 6 0 1 0 24 14 m0 10 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4 m-7 -12 a3 3 0 1 0 -3 -3 3 3 0 0 0 3 3 m0 -4 a1 1 0 1 1 -1 1 1 1 0 0 1 1 -1
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 14
          moveTo(x = 24.0f, y = 14.0f)
          // a 5.99 5.99 0 0 0 -4.88 9.47
          arcToRelative(
            a = 5.99f,
            b = 5.99f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.88f,
            dy1 = 9.47f,
          )
          // L 14 28.6
          lineTo(x = 14.0f, y = 28.6f)
          // L 15.41 30
          lineTo(x = 15.41f, y = 30.0f)
          // l 5.12 -5.11
          lineToRelative(dx = 5.12f, dy = -5.11f)
          // A 6 6 0 1 0 24 14
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 24.0f,
            y1 = 14.0f,
          )
          // m 0 10
          moveToRelative(dx = 0.0f, dy = 10.0f)
          // a 4 4 0 1 1 4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = -4.0f,
          )
          // a 4 4 0 0 1 -4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 4.0f,
          )
          // m -7 -12
          moveToRelative(dx = -7.0f, dy = -12.0f)
          // a 3 3 0 1 0 -3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -3.0f,
            dy1 = -3.0f,
          )
          // a 3 3 0 0 0 3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.0f,
            dy1 = 3.0f,
          )
          // m 0 -4
          moveToRelative(dx = 0.0f, dy = -4.0f)
          // a 1 1 0 1 1 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
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
        }
        // M12 24 H4 v-6 l5 -5 5.59 5.59 L16 17.17 l-5.59 -5.59 a2 2 0 0 0 -2.82 0 L4 15.17 V4 h20 v6 h2 V4 a2 2 0 0 0 -2 -2 H4 a2 2 0 0 0 -2 2 v20 a2 2 0 0 0 2 2 h8Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 24
          moveTo(x = 12.0f, y = 24.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // l 5 -5
          lineToRelative(dx = 5.0f, dy = -5.0f)
          // l 5.59 5.59
          lineToRelative(dx = 5.59f, dy = 5.59f)
          // L 16 17.17
          lineTo(x = 16.0f, y = 17.17f)
          // l -5.59 -5.59
          lineToRelative(dx = -5.59f, dy = -5.59f)
          // a 2 2 0 0 0 -2.82 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.82f,
            dy1 = 0.0f,
          )
          // L 4 15.17
          lineTo(x = 4.0f, y = 15.17f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 4
          verticalLineTo(y = 4.0f)
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
          // h 8z
          horizontalLineToRelative(dx = 8.0f)
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
      .also { _imageSearch = it }
  }

@Suppress("ObjectPropertyName")
private var _imageSearch: ImageVector? = null
