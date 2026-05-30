// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GenderMale: ImageVector
  get() {
    val current = _genderMale
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.GenderMale",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M18 4 v2 h6.59 l-7.7 7.69 a8.03 8.03 0 1 0 1.42 1.41 L26 7.41 V14 h2 V4Z m-6 22 a6 6 0 1 1 6 -6 6 6 0 0 1 -6 6
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 4
          moveTo(x = 18.0f, y = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 6.59
          horizontalLineToRelative(dx = 6.59f)
          // l -7.7 7.69
          lineToRelative(dx = -7.7f, dy = 7.69f)
          // a 8.03 8.03 0 1 0 1.42 1.41
          arcToRelative(
            a = 8.03f,
            b = 8.03f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 1.42f,
            dy1 = 1.41f,
          )
          // L 26 7.41
          lineTo(x = 26.0f, y = 7.41f)
          // V 14
          verticalLineTo(y = 14.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 4z
          verticalLineTo(y = 4.0f)
          close()
          // m -6 22
          moveToRelative(dx = -6.0f, dy = 22.0f)
          // a 6 6 0 1 1 6 -6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 6.0f,
            dy1 = -6.0f,
          )
          // a 6 6 0 0 1 -6 6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -6.0f,
            dy1 = 6.0f,
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
      .also { _genderMale = it }
  }

@Suppress("ObjectPropertyName")
private var _genderMale: ImageVector? = null
