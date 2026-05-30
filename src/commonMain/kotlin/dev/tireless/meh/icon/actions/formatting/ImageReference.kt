// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ImageReference: ImageVector
  get() {
    val current = _imageReference
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ImageReference",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="4.0 20.0 4.0 22.0 8.586 22.0 2.0 28.586 3.414 30.0 10.0 23.414 10.0 28.0 12.0 28.0 12.0 20.0 4.0 20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 20
          moveTo(x = 4.0f, y = 20.0f)
          // L 4 22
          lineTo(x = 4.0f, y = 22.0f)
          // L 8.586 22
          lineTo(x = 8.586f, y = 22.0f)
          // L 2 28.586
          lineTo(x = 2.0f, y = 28.586f)
          // L 3.414 30
          lineTo(x = 3.414f, y = 30.0f)
          // L 10 23.414
          lineTo(x = 10.0f, y = 23.414f)
          // L 10 28
          lineTo(x = 10.0f, y = 28.0f)
          // L 12 28
          lineTo(x = 12.0f, y = 28.0f)
          // L 12 20
          lineTo(x = 12.0f, y = 20.0f)
          // L 4 20z
          lineTo(x = 4.0f, y = 20.0f)
          close()
        }
        // M19 14 a3 3 0 1 0 -3 -3 3 3 0 0 0 3 3 m0 -4 a1 1 0 1 1 -1 1 1 1 0 0 1 1 -1
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19 14
          moveTo(x = 19.0f, y = 14.0f)
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
        // M26 4 H6 a2 2 0 0 0 -2 2 v10 h2 V6 h20 v15.17 l-3.59 -3.59 a2 2 0 0 0 -2.82 0 L18 19.17 11.83 13 l-1.41 1.42 L14 18 l2.59 2.59 a2 2 0 0 0 2.82 0 L21 19 l5 5 v2 H16 v2 h10 a2 2 0 0 0 2 -2 V6 a2 2 0 0 0 -2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 4
          moveTo(x = 26.0f, y = 4.0f)
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
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // v 15.17
          verticalLineToRelative(dy = 15.17f)
          // l -3.59 -3.59
          lineToRelative(dx = -3.59f, dy = -3.59f)
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
          // L 18 19.17
          lineTo(x = 18.0f, y = 19.17f)
          // L 11.83 13
          lineTo(x = 11.83f, y = 13.0f)
          // l -1.41 1.42
          lineToRelative(dx = -1.41f, dy = 1.42f)
          // L 14 18
          lineTo(x = 14.0f, y = 18.0f)
          // l 2.59 2.59
          lineToRelative(dx = 2.59f, dy = 2.59f)
          // a 2 2 0 0 0 2.82 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.82f,
            dy1 = 0.0f,
          )
          // L 21 19
          lineTo(x = 21.0f, y = 19.0f)
          // l 5 5
          lineToRelative(dx = 5.0f, dy = 5.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 16
          horizontalLineTo(x = 16.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
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
      .also { _imageReference = it }
  }

@Suppress("ObjectPropertyName")
private var _imageReference: ImageVector? = null
