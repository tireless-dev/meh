// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GlobalLoanAndTrial: ImageVector
  get() {
    val current = _globalLoanAndTrial
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.GlobalLoanAndTrial",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m15 22 -1.41 1.41 L16.17 26 H4 V8 H2 v18 a2 2 0 0 0 2 2 h12.17 l-2.58 2.59 L15 32 l5 -5z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15 22
          moveTo(x = 15.0f, y = 22.0f)
          // l -1.41 1.41
          lineToRelative(dx = -1.41f, dy = 1.41f)
          // L 16.17 26
          lineTo(x = 16.17f, y = 26.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 18
          verticalLineToRelative(dy = 18.0f)
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
          // h 12.17
          horizontalLineToRelative(dx = 12.17f)
          // l -2.58 2.59
          lineToRelative(dx = -2.58f, dy = 2.59f)
          // L 15 32
          lineTo(x = 15.0f, y = 32.0f)
          // l 5 -5z
          lineToRelative(dx = 5.0f, dy = -5.0f)
          close()
        }
        // <circle cx="11.0" cy="16.0" radius="1.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11 16
          moveTo(x = 11.0f, y = 16.0f)
          // m -1 0
          moveToRelative(dx = -1.0f, dy = 0.0f)
          // a 1 1 0 1 1 2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
          // a 1 1 0 1 1 -2 0z
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // M24 20 H8 a2 2 0 0 1 -2 -2 v-4 a2 2 0 0 1 2 -2 h16 a2 2 0 0 1 2 2 v4 a2 2 0 0 1 -2 2 M8 14 v4 h16 v-4z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 20
          moveTo(x = 24.0f, y = 20.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
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
          // h 16
          horizontalLineToRelative(dx = 16.0f)
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
          // M 8 14
          moveTo(x = 8.0f, y = 14.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // v -4z
          verticalLineToRelative(dy = -4.0f)
          close()
        }
        // M28 4 H15.83 l2.58 -2.59 L17 0 l-5 5 5 5 1.41 -1.41 L15.83 6 H28 v18 h2 V6 a2 2 0 0 0 -2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 4
          moveTo(x = 28.0f, y = 4.0f)
          // H 15.83
          horizontalLineTo(x = 15.83f)
          // l 2.58 -2.59
          lineToRelative(dx = 2.58f, dy = -2.59f)
          // L 17 0
          lineTo(x = 17.0f, y = 0.0f)
          // l -5 5
          lineToRelative(dx = -5.0f, dy = 5.0f)
          // l 5 5
          lineToRelative(dx = 5.0f, dy = 5.0f)
          // l 1.41 -1.41
          lineToRelative(dx = 1.41f, dy = -1.41f)
          // L 15.83 6
          lineTo(x = 15.83f, y = 6.0f)
          // H 28
          horizontalLineTo(x = 28.0f)
          // v 18
          verticalLineToRelative(dy = 18.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 6
          verticalLineTo(y = 6.0f)
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
      .also { _globalLoanAndTrial = it }
  }

@Suppress("ObjectPropertyName")
private var _globalLoanAndTrial: ImageVector? = null
