// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.alphanumeric

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LetterGg: ImageVector
  get() {
    val current = _letterGg
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LetterGg",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M19 13 a2 2 0 0 0 -2 2 v6 a2 2 0 0 0 2 2 h4 v2 h-5 v2 h5 a2 2 0 0 0 2 -2 V13Z m4 8 h-4 v-6 h4Z m-8 2 H9 a2 2 0 0 1 -2 -2 V11 a2 2 0 0 1 2 -2 h6 v2 H9 v10 h4 v-4 h-2 v-2 h4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19 13
          moveTo(x = 19.0f, y = 13.0f)
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
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
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
          // V 13z
          verticalLineTo(y = 13.0f)
          close()
          // m 4 8
          moveToRelative(dx = 4.0f, dy = 8.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
          // m -8 2
          moveToRelative(dx = -8.0f, dy = 2.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
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
          // V 11
          verticalLineTo(y = 11.0f)
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
          // H 9
          horizontalLineTo(x = 9.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
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
      .also { _letterGg = it }
  }

@Suppress("ObjectPropertyName")
private var _letterGg: ImageVector? = null
