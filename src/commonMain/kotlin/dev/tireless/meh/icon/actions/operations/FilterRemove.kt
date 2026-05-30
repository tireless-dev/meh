// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FilterRemove: ImageVector
  get() {
    val current = _filterRemove
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.FilterRemove",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="30.0 11.414 28.586 10.0 24.0 14.586 19.414 10.0 18.0 11.414 22.586 16.0 18.0 20.585 19.415 22.0 24.0 17.414 28.587 22.0 30.0 20.587 25.414 16.0 30.0 11.414" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 11.414
          moveTo(x = 30.0f, y = 11.414f)
          // L 28.586 10
          lineTo(x = 28.586f, y = 10.0f)
          // L 24 14.586
          lineTo(x = 24.0f, y = 14.586f)
          // L 19.414 10
          lineTo(x = 19.414f, y = 10.0f)
          // L 18 11.414
          lineTo(x = 18.0f, y = 11.414f)
          // L 22.586 16
          lineTo(x = 22.586f, y = 16.0f)
          // L 18 20.585
          lineTo(x = 18.0f, y = 20.585f)
          // L 19.415 22
          lineTo(x = 19.415f, y = 22.0f)
          // L 24 17.414
          lineTo(x = 24.0f, y = 17.414f)
          // L 28.587 22
          lineTo(x = 28.587f, y = 22.0f)
          // L 30 20.587
          lineTo(x = 30.0f, y = 20.587f)
          // L 25.414 16
          lineTo(x = 25.414f, y = 16.0f)
          // L 30 11.414z
          lineTo(x = 30.0f, y = 11.414f)
          close()
        }
        // M4 4 a2 2 0 0 0 -2 2 v3.17 a2 2 0 0 0 .59 1.42 L10 18 v8 a2 2 0 0 0 2 2 h4 a2 2 0 0 0 2 -2 v-2 h-2 v2 h-4 v-8.83 l-.59 -.58 L4 9.17 V6 h20 v2 h2 V6 a2 2 0 0 0 -2 -2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 4
          moveTo(x = 4.0f, y = 4.0f)
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
          // v 3.17
          verticalLineToRelative(dy = 3.17f)
          // a 2 2 0 0 0 0.59 1.42
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.59f,
            dy1 = 1.42f,
          )
          // L 10 18
          lineTo(x = 10.0f, y = 18.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
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
          // h 4
          horizontalLineToRelative(dx = 4.0f)
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
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -8.83
          verticalLineToRelative(dy = -8.83f)
          // l -0.59 -0.58
          lineToRelative(dx = -0.59f, dy = -0.58f)
          // L 4 9.17
          lineTo(x = 4.0f, y = 9.17f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // a 2 2 0 0 0 -2 -2z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
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
      .also { _filterRemove = it }
  }

@Suppress("ObjectPropertyName")
private var _filterRemove: ImageVector? = null
