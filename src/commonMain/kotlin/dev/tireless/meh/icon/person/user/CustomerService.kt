// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CustomerService: ImageVector
  get() {
    val current = _customerService
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CustomerService",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 30 h-2 v-5 a5 5 0 0 0 -5 -5 h-6 a5 5 0 0 0 -5 5 v5 H6 v-5 a7 7 0 0 1 7 -7 h6 a7 7 0 0 1 7 7z M22 6 v4 a2 2 0 0 1 -2 2 h-1 a1 1 0 0 0 0 2 h1 a4 4 0 0 0 4 -4 V6z m-6 10 a7 7 0 1 1 5.22 -11.67 l-1.5 1.34 A5 5 0 1 0 16 14z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 30
          moveTo(x = 26.0f, y = 30.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // a 5 5 0 0 0 -5 -5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.0f,
            dy1 = -5.0f,
          )
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // a 5 5 0 0 0 -5 5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.0f,
            dy1 = 5.0f,
          )
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // a 7 7 0 0 1 7 -7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 7.0f,
            dy1 = -7.0f,
          )
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // a 7 7 0 0 1 7 7z
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 7.0f,
            dy1 = 7.0f,
          )
          close()
          // M 22 6
          moveTo(x = 22.0f, y = 6.0f)
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
          // h -1
          horizontalLineToRelative(dx = -1.0f)
          // a 1 1 0 0 0 0 2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 2.0f,
          )
          // h 1
          horizontalLineToRelative(dx = 1.0f)
          // a 4 4 0 0 0 4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.0f,
            dy1 = -4.0f,
          )
          // V 6z
          verticalLineTo(y = 6.0f)
          close()
          // m -6 10
          moveToRelative(dx = -6.0f, dy = 10.0f)
          // a 7 7 0 1 1 5.22 -11.67
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 5.22f,
            dy1 = -11.67f,
          )
          // l -1.5 1.34
          lineToRelative(dx = -1.5f, dy = 1.34f)
          // A 5 5 0 1 0 16 14z
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 14.0f,
          )
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
      .also { _customerService = it }
  }

@Suppress("ObjectPropertyName")
private var _customerService: ImageVector? = null
