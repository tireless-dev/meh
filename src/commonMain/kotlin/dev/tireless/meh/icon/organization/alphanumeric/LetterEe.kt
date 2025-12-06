// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.alphanumeric

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LetterEe: ImageVector
  get() {
    val current = _letterEe
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LetterEe",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M25 19 v-4 a2 2 0 0 0 -2 -2 h-4 a2 2 0 0 0 -2 2 v6 a2 2 0 0 0 2 2 h5 v-2 h-5 v-2Z m-6 -4 h4 v2 h-4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 19
          moveTo(x = 25.0f, y = 19.0f)
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
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // v -2z
          verticalLineToRelative(dy = -2.0f)
          close()
          // m -6 -4
          moveToRelative(dx = -6.0f, dy = -4.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <polygon points="15.0 11.0 15.0 9.0 7.0 9.0 7.0 23.0 15.0 23.0 15.0 21.0 9.0 21.0 9.0 17.0 14.0 17.0 14.0 15.0 9.0 15.0 9.0 11.0 15.0 11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15 11
          moveTo(x = 15.0f, y = 11.0f)
          // L 15 9
          lineTo(x = 15.0f, y = 9.0f)
          // L 7 9
          lineTo(x = 7.0f, y = 9.0f)
          // L 7 23
          lineTo(x = 7.0f, y = 23.0f)
          // L 15 23
          lineTo(x = 15.0f, y = 23.0f)
          // L 15 21
          lineTo(x = 15.0f, y = 21.0f)
          // L 9 21
          lineTo(x = 9.0f, y = 21.0f)
          // L 9 17
          lineTo(x = 9.0f, y = 17.0f)
          // L 14 17
          lineTo(x = 14.0f, y = 17.0f)
          // L 14 15
          lineTo(x = 14.0f, y = 15.0f)
          // L 9 15
          lineTo(x = 9.0f, y = 15.0f)
          // L 9 11
          lineTo(x = 9.0f, y = 11.0f)
          // L 15 11z
          lineTo(x = 15.0f, y = 11.0f)
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
      .also { _letterEe = it }
  }

@Suppress("ObjectPropertyName")
private var _letterEe: ImageVector? = null
