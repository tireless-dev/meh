// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrayStrings: ImageVector
  get() {
    val current = _arrayStrings
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ArrayStrings",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M4 28 h4 v2 H4 a2 2 0 0 1 -2 -2 v-4 h2z m7 -15 v8 H6 a2 2 0 0 1 -2 -2 v-2 a2 2 0 0 1 2 -2 h3 v-2 H5 v-2 h4 a2 2 0 0 1 2 2 m-2 4 H6 v2 h3z M4 4 h4 V2 H4 a2 2 0 0 0 -2 2 v4 h2z m24 -2 h-4 v2 h4 v4 h2 V4 a2 2 0 0 0 -2 -2 m0 26 h-4 v2 h4 a2 2 0 0 0 2 -2 v-4 h-2z m0 -7 v-2 h-4 v-6 h4 v-2 h-4 a2 2 0 0 0 -2 2 v6 a2 2 0 0 0 2 2z m-8 -8 v6 a2 2 0 0 1 -2 2 h-5 V8 h2 v3 h3 a2 2 0 0 1 2 2 m-2 0 h-3 v6 h3z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 28
          moveTo(x = 4.0f, y = 28.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
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
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
          // m 7 -15
          moveToRelative(dx = 7.0f, dy = -15.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
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
          // v -2
          verticalLineToRelative(dy = -2.0f)
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
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
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
          // m -2 4
          moveToRelative(dx = -2.0f, dy = 4.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 3z
          horizontalLineToRelative(dx = 3.0f)
          close()
          // M 4 4
          moveTo(x = 4.0f, y = 4.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // V 2
          verticalLineTo(y = 2.0f)
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
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
          // m 24 -2
          moveToRelative(dx = 24.0f, dy = -2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
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
          // m 0 26
          moveToRelative(dx = 0.0f, dy = 26.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
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
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
          // m 0 -7
          moveToRelative(dx = 0.0f, dy = -7.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
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
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // a 2 2 0 0 0 2 2z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          close()
          // m -8 -8
          moveToRelative(dx = -8.0f, dy = -8.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
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
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
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
          // m -2 0
          moveToRelative(dx = -2.0f, dy = 0.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h 3z
          horizontalLineToRelative(dx = 3.0f)
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
      .also { _arrayStrings = it }
  }

@Suppress("ObjectPropertyName")
private var _arrayStrings: ImageVector? = null
