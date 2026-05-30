// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SDK: ImageVector
  get() {
    val current = _sDK
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.SDK",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="30.0 9.0 27.9 9.0 24.0 15.6 24.0 9.0 22.0 9.0 22.0 23.0 24.0 23.0 24.0 18.7 24.9 17.2 27.9 23.0 30.0 23.0 26.1 15.4 30.0 9.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 9
          moveTo(x = 30.0f, y = 9.0f)
          // L 27.9 9
          lineTo(x = 27.9f, y = 9.0f)
          // L 24 15.6
          lineTo(x = 24.0f, y = 15.6f)
          // L 24 9
          lineTo(x = 24.0f, y = 9.0f)
          // L 22 9
          lineTo(x = 22.0f, y = 9.0f)
          // L 22 23
          lineTo(x = 22.0f, y = 23.0f)
          // L 24 23
          lineTo(x = 24.0f, y = 23.0f)
          // L 24 18.7
          lineTo(x = 24.0f, y = 18.7f)
          // L 24.9 17.2
          lineTo(x = 24.9f, y = 17.2f)
          // L 27.9 23
          lineTo(x = 27.9f, y = 23.0f)
          // L 30 23
          lineTo(x = 30.0f, y = 23.0f)
          // L 26.1 15.4
          lineTo(x = 26.1f, y = 15.4f)
          // L 30 9z
          lineTo(x = 30.0f, y = 9.0f)
          close()
        }
        // M16 23 h-4 V9 h4 a4 4 0 0 1 4 4 v6 a4 4 0 0 1 -4 4 m-2 -2 h2 a2 2 0 0 0 2 -2 v-6 a2 2 0 0 0 -2 -2 h-2Z m-6 2 H2 v-2 h6 v-4 H4 a2 2 0 0 1 -2 -2 v-4 a2 2 0 0 1 2 -2 h6 v2 H4 v4 h4 a2 2 0 0 1 2 2 v4 a2 2 0 0 1 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 23
          moveTo(x = 16.0f, y = 23.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 9
          verticalLineTo(y = 9.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // a 4 4 0 0 1 4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 4.0f,
          )
          // v 6
          verticalLineToRelative(dy = 6.0f)
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
          // m -2 -2
          moveToRelative(dx = -2.0f, dy = -2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
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
          // v -6
          verticalLineToRelative(dy = -6.0f)
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
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
          // m -6 2
          moveToRelative(dx = -6.0f, dy = 2.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
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
          // v -4
          verticalLineToRelative(dy = -4.0f)
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
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
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
          // v 4
          verticalLineToRelative(dy = 4.0f)
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
      .also { _sDK = it }
  }

@Suppress("ObjectPropertyName")
private var _sDK: ImageVector? = null
