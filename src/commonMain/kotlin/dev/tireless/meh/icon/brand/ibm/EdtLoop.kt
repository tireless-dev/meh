// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.brand.ibm

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EdtLoop: ImageVector
  get() {
    val current = _edtLoop
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.EdtLoop",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M23.63 22.59 a6.1 6.1 0 0 1 -4.5 -1.9 l-3.1 -3.2 -3.1 3.2 a6.46 6.46 0 0 1 -9.1 0 7 7 0 0 1 -1.8 -4.7 6.7 6.7 0 0 1 1.9 -4.7 6.34 6.34 0 0 1 9 0 l3.1 3.2 3.1 -3.2 a6.34 6.34 0 0 1 9 0 6.83 6.83 0 0 1 0 9.4 6.5 6.5 0 0 1 -4.5 1.9 m-6.2 -6.6 3.1 3.3 a4.4 4.4 0 0 0 6.2 0 4.9 4.9 0 0 0 0 -6.6 4.4 4.4 0 0 0 -6.2 0Z m-9 -4.6 a4.2 4.2 0 0 0 -3.1 1.3 4.84 4.84 0 0 0 0 6.6 4.4 4.4 0 0 0 6.2 0 l3.1 -3.3 -3.1 -3.3 a4.8 4.8 0 0 0 -3.1 -1.3
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23.63 22.59
          moveTo(x = 23.63f, y = 22.59f)
          // a 6.1 6.1 0 0 1 -4.5 -1.9
          arcToRelative(
            a = 6.1f,
            b = 6.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.5f,
            dy1 = -1.9f,
          )
          // l -3.1 -3.2
          lineToRelative(dx = -3.1f, dy = -3.2f)
          // l -3.1 3.2
          lineToRelative(dx = -3.1f, dy = 3.2f)
          // a 6.46 6.46 0 0 1 -9.1 0
          arcToRelative(
            a = 6.46f,
            b = 6.46f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -9.1f,
            dy1 = 0.0f,
          )
          // a 7 7 0 0 1 -1.8 -4.7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.8f,
            dy1 = -4.7f,
          )
          // a 6.7 6.7 0 0 1 1.9 -4.7
          arcToRelative(
            a = 6.7f,
            b = 6.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.9f,
            dy1 = -4.7f,
          )
          // a 6.34 6.34 0 0 1 9 0
          arcToRelative(
            a = 6.34f,
            b = 6.34f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 9.0f,
            dy1 = 0.0f,
          )
          // l 3.1 3.2
          lineToRelative(dx = 3.1f, dy = 3.2f)
          // l 3.1 -3.2
          lineToRelative(dx = 3.1f, dy = -3.2f)
          // a 6.34 6.34 0 0 1 9 0
          arcToRelative(
            a = 6.34f,
            b = 6.34f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 9.0f,
            dy1 = 0.0f,
          )
          // a 6.83 6.83 0 0 1 0 9.4
          arcToRelative(
            a = 6.83f,
            b = 6.83f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 9.4f,
          )
          // a 6.5 6.5 0 0 1 -4.5 1.9
          arcToRelative(
            a = 6.5f,
            b = 6.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.5f,
            dy1 = 1.9f,
          )
          // m -6.2 -6.6
          moveToRelative(dx = -6.2f, dy = -6.6f)
          // l 3.1 3.3
          lineToRelative(dx = 3.1f, dy = 3.3f)
          // a 4.4 4.4 0 0 0 6.2 0
          arcToRelative(
            a = 4.4f,
            b = 4.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 6.2f,
            dy1 = 0.0f,
          )
          // a 4.9 4.9 0 0 0 0 -6.6
          arcToRelative(
            a = 4.9f,
            b = 4.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -6.6f,
          )
          // a 4.4 4.4 0 0 0 -6.2 0z
          arcToRelative(
            a = 4.4f,
            b = 4.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.2f,
            dy1 = 0.0f,
          )
          close()
          // m -9 -4.6
          moveToRelative(dx = -9.0f, dy = -4.6f)
          // a 4.2 4.2 0 0 0 -3.1 1.3
          arcToRelative(
            a = 4.2f,
            b = 4.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.1f,
            dy1 = 1.3f,
          )
          // a 4.84 4.84 0 0 0 0 6.6
          arcToRelative(
            a = 4.84f,
            b = 4.84f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 6.6f,
          )
          // a 4.4 4.4 0 0 0 6.2 0
          arcToRelative(
            a = 4.4f,
            b = 4.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 6.2f,
            dy1 = 0.0f,
          )
          // l 3.1 -3.3
          lineToRelative(dx = 3.1f, dy = -3.3f)
          // l -3.1 -3.3
          lineToRelative(dx = -3.1f, dy = -3.3f)
          // a 4.8 4.8 0 0 0 -3.1 -1.3
          arcToRelative(
            a = 4.8f,
            b = 4.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.1f,
            dy1 = -1.3f,
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
      .also { _edtLoop = it }
  }

@Suppress("ObjectPropertyName")
private var _edtLoop: ImageVector? = null
