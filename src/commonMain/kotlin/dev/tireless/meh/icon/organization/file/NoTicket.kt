// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NoTicket: ImageVector
  get() {
    val current = _noTicket
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.NoTicket",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 6 h-.59 L30 3.41 28.59 2 2 28.59 3.41 30 l4 -4 H28 a2 2 0 0 0 2 -2 v-5 a1 1 0 0 0 -1 -1 2 2 0 0 1 0 -4 1 1 0 0 0 1 -1 V8 a2 2 0 0 0 -2 -2 m0 6.13 a4 4 0 0 0 0 7.74 V24 h-7 v-3 h-2 v3 H9.41 L19 14.41 V19 h2 v-6.59 L25.41 8 H28Z m-24 0 V8 h15 V6 H4 a2 2 0 0 0 -2 2 v5 a1 1 0 0 0 1 1 2 2 0 0 1 0 4 1 1 0 0 0 -1 1 v5 h2 v-4.13 a4 4 0 0 0 0 -7.74
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 6
          moveTo(x = 28.0f, y = 6.0f)
          // h -0.59
          horizontalLineToRelative(dx = -0.59f)
          // L 30 3.41
          lineTo(x = 30.0f, y = 3.41f)
          // L 28.59 2
          lineTo(x = 28.59f, y = 2.0f)
          // L 2 28.59
          lineTo(x = 2.0f, y = 28.59f)
          // L 3.41 30
          lineTo(x = 3.41f, y = 30.0f)
          // l 4 -4
          lineToRelative(dx = 4.0f, dy = -4.0f)
          // H 28
          horizontalLineTo(x = 28.0f)
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
          // m 0 6.13
          moveToRelative(dx = 0.0f, dy = 6.13f)
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
          // H 9.41
          horizontalLineTo(x = 9.41f)
          // L 19 14.41
          lineTo(x = 19.0f, y = 14.41f)
          // V 19
          verticalLineTo(y = 19.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -6.59
          verticalLineToRelative(dy = -6.59f)
          // L 25.41 8
          lineTo(x = 25.41f, y = 8.0f)
          // H 28z
          horizontalLineTo(x = 28.0f)
          close()
          // m -24 0
          moveToRelative(dx = -24.0f, dy = 0.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // h 15
          horizontalLineToRelative(dx = 15.0f)
          // V 6
          verticalLineTo(y = 6.0f)
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
          // h 2
          horizontalLineToRelative(dx = 2.0f)
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
      .also { _noTicket = it }
  }

@Suppress("ObjectPropertyName")
private var _noTicket: ImageVector? = null
