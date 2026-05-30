// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gift: ImageVector
  get() {
    val current = _gift
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Gift",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 10 h-2.76 A4.49 4.49 0 0 0 16 4.7 4.49 4.49 0 0 0 8.76 10 H6 a2 2 0 0 0 -2 2 v4 a2 2 0 0 0 2 2 v10 a2 2 0 0 0 2 2 h16 a2 2 0 0 0 2 -2 V18 a2 2 0 0 0 2 -2 v-4 a2 2 0 0 0 -2 -2 m-9 -2.5 a2.5 2.5 0 1 1 2.5 2.5 H17Z M12.5 5 A2.5 2.5 0 0 1 15 7.5 V10 h-2.5 a2.5 2.5 0 0 1 0 -5 M6 12 h9 v4 H6Z m2 6 h7 v10 H8Z m16 10 h-7 V18 h7Z m-7 -12 v-4 h9 v4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 10
          moveTo(x = 26.0f, y = 10.0f)
          // h -2.76
          horizontalLineToRelative(dx = -2.76f)
          // A 4.49 4.49 0 0 0 16 4.7
          arcTo(
            horizontalEllipseRadius = 4.49f,
            verticalEllipseRadius = 4.49f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 4.7f,
          )
          // A 4.49 4.49 0 0 0 8.76 10
          arcTo(
            horizontalEllipseRadius = 4.49f,
            verticalEllipseRadius = 4.49f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 8.76f,
            y1 = 10.0f,
          )
          // H 6
          horizontalLineTo(x = 6.0f)
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
          // v 10
          verticalLineToRelative(dy = 10.0f)
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
          // h 16
          horizontalLineToRelative(dx = 16.0f)
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
          // V 18
          verticalLineTo(y = 18.0f)
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
          // m -9 -2.5
          moveToRelative(dx = -9.0f, dy = -2.5f)
          // a 2.5 2.5 0 1 1 2.5 2.5
          arcToRelative(
            a = 2.5f,
            b = 2.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.5f,
            dy1 = 2.5f,
          )
          // H 17z
          horizontalLineTo(x = 17.0f)
          close()
          // M 12.5 5
          moveTo(x = 12.5f, y = 5.0f)
          // A 2.5 2.5 0 0 1 15 7.5
          arcTo(
            horizontalEllipseRadius = 2.5f,
            verticalEllipseRadius = 2.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 15.0f,
            y1 = 7.5f,
          )
          // V 10
          verticalLineTo(y = 10.0f)
          // h -2.5
          horizontalLineToRelative(dx = -2.5f)
          // a 2.5 2.5 0 0 1 0 -5
          arcToRelative(
            a = 2.5f,
            b = 2.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -5.0f,
          )
          // M 6 12
          moveTo(x = 6.0f, y = 12.0f)
          // h 9
          horizontalLineToRelative(dx = 9.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 6z
          horizontalLineTo(x = 6.0f)
          close()
          // m 2 6
          moveToRelative(dx = 2.0f, dy = 6.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // H 8z
          horizontalLineTo(x = 8.0f)
          close()
          // m 16 10
          moveToRelative(dx = 16.0f, dy = 10.0f)
          // h -7
          horizontalLineToRelative(dx = -7.0f)
          // V 18
          verticalLineTo(y = 18.0f)
          // h 7z
          horizontalLineToRelative(dx = 7.0f)
          close()
          // m -7 -12
          moveToRelative(dx = -7.0f, dy = -12.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 9
          horizontalLineToRelative(dx = 9.0f)
          // v 4z
          verticalLineToRelative(dy = 4.0f)
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
      .also { _gift = it }
  }

@Suppress("ObjectPropertyName")
private var _gift: ImageVector? = null
