// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Ticket: ImageVector
  get() {
    val current = _ticket
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Ticket",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M29 14 a1 1 0 0 0 1 -1 V8 a2 2 0 0 0 -2 -2 H4 a2 2 0 0 0 -2 2 v5 a1 1 0 0 0 1 1 2 2 0 0 1 0 4 1 1 0 0 0 -1 1 v5 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 v-5 a1 1 0 0 0 -1 -1 2 2 0 0 1 0 -4 m-1 5.87 V24 h-7 v-3 h-2 v3 H4 v-4.13 a4 4 0 0 0 0 -7.74 V8 h15 v3 h2 V8 h7 v4.13 a4 4 0 0 0 0 7.74
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29 14
          moveTo(x = 29.0f, y = 14.0f)
          // a 1 1 0 0 0 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // V 8
          verticalLineTo(y = 8.0f)
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
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // a 1 1 0 0 0 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // a 2 2 0 0 1 0 4
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 4.0f,
          )
          // a 1 1 0 0 0 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // v 5
          verticalLineToRelative(dy = 5.0f)
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
          // h 24
          horizontalLineToRelative(dx = 24.0f)
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
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // a 1 1 0 0 0 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // a 2 2 0 0 1 0 -4
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -4.0f,
          )
          // m -1 5.87
          moveToRelative(dx = -1.0f, dy = 5.87f)
          // V 24
          verticalLineTo(y = 24.0f)
          // h -7
          horizontalLineToRelative(dx = -7.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -4.13
          verticalLineToRelative(dy = -4.13f)
          // a 4 4 0 0 0 0 -7.74
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -7.74f,
          )
          // V 8
          verticalLineTo(y = 8.0f)
          // h 15
          horizontalLineToRelative(dx = 15.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v 4.13
          verticalLineToRelative(dy = 4.13f)
          // a 4 4 0 0 0 0 7.74
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 7.74f,
          )
        }
        // <rect width="2" height="6" x="19.0" y="13.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19 13
          moveTo(x = 19.0f, y = 13.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
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
      .also { _ticket = it }
  }

@Suppress("ObjectPropertyName")
private var _ticket: ImageVector? = null
