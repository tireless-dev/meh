// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CategoryAdd: ImageVector
  get() {
    val current = _categoryAdd
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CategoryAdd",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="15.0 6.0 13.59 7.41 17.17 11.0 13.59 14.59 15.0 16.0 20.0 11.0 15.0 6.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15 6
          moveTo(x = 15.0f, y = 6.0f)
          // L 13.59 7.41
          lineTo(x = 13.59f, y = 7.41f)
          // L 17.17 11
          lineTo(x = 17.17f, y = 11.0f)
          // L 13.59 14.59
          lineTo(x = 13.59f, y = 14.59f)
          // L 15 16
          lineTo(x = 15.0f, y = 16.0f)
          // L 20 11
          lineTo(x = 20.0f, y = 11.0f)
          // L 15 6z
          lineTo(x = 15.0f, y = 6.0f)
          close()
        }
        // M28 24 H17 v-4 h6 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 H9 a2 2 0 0 0 -2 2 v14 a2 2 0 0 0 2 2 h6 v4 H4 a2 2 0 0 0 -2 2 v4 h2 v-4 h11 v4 h2 v-4 h11 v4 h2 v-4 a2 2 0 0 0 -2 -2 M9 4 h14 v14 H9Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 24
          moveTo(x = 28.0f, y = 24.0f)
          // H 17
          horizontalLineTo(x = 17.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
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
          // H 9
          horizontalLineTo(x = 9.0f)
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
          // v 14
          verticalLineToRelative(dy = 14.0f)
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
          // v 4
          verticalLineToRelative(dy = 4.0f)
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
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 11
          horizontalLineToRelative(dx = 11.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 11
          horizontalLineToRelative(dx = 11.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
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
          // M 9 4
          moveTo(x = 9.0f, y = 4.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v 14
          verticalLineToRelative(dy = 14.0f)
          // H 9z
          horizontalLineTo(x = 9.0f)
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
      .also { _categoryAdd = it }
  }

@Suppress("ObjectPropertyName")
private var _categoryAdd: ImageVector? = null
