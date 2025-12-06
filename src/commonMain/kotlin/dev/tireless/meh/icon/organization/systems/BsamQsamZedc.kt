// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BsamQsamZedc: ImageVector
  get() {
    val current = _bsamQsamZedc
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.BsamQsamZedc",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M24 25 h2 v3 a2 2 0 0 1 -2 2 H6 a2 2 0 0 1 -2 -2 V4 a2 2 0 0 1 2 -2 h18 a2 2 0 0 1 2 2 v3 h-2 V4 H6 v24 h18z m-8 1 v-5.2 l2.3 2.3 1.4 -1.4 L15 17 l-4.7 4.7 1.4 1.4 2.3 -2.3 V26z m2.3 -17.1 L16 11.2 V6 h-2 v5.2 l-2.3 -2.3 -1.4 1.4 L15 15 l4.7 -4.7z M22 17 h6 v-2 h-6z m0 -6 v2 h6 v-2z m0 10 h6 v-2 h-6z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 25
          moveTo(x = 24.0f, y = 25.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
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
          // H 6
          horizontalLineTo(x = 6.0f)
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
          // V 4
          verticalLineTo(y = 4.0f)
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
          // h 18
          horizontalLineToRelative(dx = 18.0f)
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
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v 24
          verticalLineToRelative(dy = 24.0f)
          // h 18z
          horizontalLineToRelative(dx = 18.0f)
          close()
          // m -8 1
          moveToRelative(dx = -8.0f, dy = 1.0f)
          // v -5.2
          verticalLineToRelative(dy = -5.2f)
          // l 2.3 2.3
          lineToRelative(dx = 2.3f, dy = 2.3f)
          // l 1.4 -1.4
          lineToRelative(dx = 1.4f, dy = -1.4f)
          // L 15 17
          lineTo(x = 15.0f, y = 17.0f)
          // l -4.7 4.7
          lineToRelative(dx = -4.7f, dy = 4.7f)
          // l 1.4 1.4
          lineToRelative(dx = 1.4f, dy = 1.4f)
          // l 2.3 -2.3
          lineToRelative(dx = 2.3f, dy = -2.3f)
          // V 26z
          verticalLineTo(y = 26.0f)
          close()
          // m 2.3 -17.1
          moveToRelative(dx = 2.3f, dy = -17.1f)
          // L 16 11.2
          lineTo(x = 16.0f, y = 11.2f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 5.2
          verticalLineToRelative(dy = 5.2f)
          // l -2.3 -2.3
          lineToRelative(dx = -2.3f, dy = -2.3f)
          // l -1.4 1.4
          lineToRelative(dx = -1.4f, dy = 1.4f)
          // L 15 15
          lineTo(x = 15.0f, y = 15.0f)
          // l 4.7 -4.7z
          lineToRelative(dx = 4.7f, dy = -4.7f)
          close()
          // M 22 17
          moveTo(x = 22.0f, y = 17.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -6z
          horizontalLineToRelative(dx = -6.0f)
          close()
          // m 0 -6
          moveToRelative(dx = 0.0f, dy = -6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v -2z
          verticalLineToRelative(dy = -2.0f)
          close()
          // m 0 10
          moveToRelative(dx = 0.0f, dy = 10.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -6z
          horizontalLineToRelative(dx = -6.0f)
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
      .also { _bsamQsamZedc = it }
  }

@Suppress("ObjectPropertyName")
private var _bsamQsamZedc: ImageVector? = null
