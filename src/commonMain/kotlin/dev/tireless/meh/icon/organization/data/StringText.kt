// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val StringText: ImageVector
  get() {
    val current = _stringText
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.StringText",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M29 22 h-5 a2 2 0 0 1 -2 -2 v-6 a2 2 0 0 1 2 -2 h5 v2 h-5 v6 h5Z M18 12 h-4 V8 h-2 v14 h6 a2 2 0 0 0 2 -2 v-6 a2 2 0 0 0 -2 -2 m-4 8 v-6 h4 v6Z m-6 -8 H3 v2 h5 v2 H4 a2 2 0 0 0 -2 2 v2 a2 2 0 0 0 2 2 h6 v-8 a2 2 0 0 0 -2 -2 m0 8 H4 v-2 h4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29 22
          moveTo(x = 29.0f, y = 22.0f)
          // h -5
          horizontalLineToRelative(dx = -5.0f)
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
          // v -6
          verticalLineToRelative(dy = -6.0f)
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
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h 5z
          horizontalLineToRelative(dx = 5.0f)
          close()
          // M 18 12
          moveTo(x = 18.0f, y = 12.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 14
          verticalLineToRelative(dy = 14.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
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
          // m -4 8
          moveToRelative(dx = -4.0f, dy = 8.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 6z
          verticalLineToRelative(dy = 6.0f)
          close()
          // m -6 -8
          moveToRelative(dx = -6.0f, dy = -8.0f)
          // H 3
          horizontalLineTo(x = 3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
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
          // v 2
          verticalLineToRelative(dy = 2.0f)
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
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
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
          // m 0 8
          moveToRelative(dx = 0.0f, dy = 8.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
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
      .also { _stringText = it }
  }

@Suppress("ObjectPropertyName")
private var _stringText: ImageVector? = null
