// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val IncompleteError: ImageVector
  get() {
    val current = _incompleteError
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.IncompleteError",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M14 26 a12 12 0 0 1 0 -24Z m3.83 -21.24 a10 10 0 0 1 3.24 2.17 l1.41 -1.41 a12 12 0 0 0 -3.89 -2.6Z M26 14 a12 12 0 0 0 -.92 -4.6 l-1.84 .77 A10 10 0 0 1 24 14Z m4 10 a6 6 0 1 0 -6 6 6 6 0 0 0 6 -6 m-2 0 a4 4 0 0 1 -.57 2.02 l-5.45 -5.45 A4 4 0 0 1 24 20 a4 4 0 0 1 4 4 m-8 0 a4 4 0 0 1 .57 -2.02 l5.45 5.45 A4 4 0 0 1 24 28 a4 4 0 0 1 -4 -4
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 26
          moveTo(x = 14.0f, y = 26.0f)
          // a 12 12 0 0 1 0 -24z
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -24.0f,
          )
          close()
          // m 3.83 -21.24
          moveToRelative(dx = 3.83f, dy = -21.24f)
          // a 10 10 0 0 1 3.24 2.17
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.24f,
            dy1 = 2.17f,
          )
          // l 1.41 -1.41
          lineToRelative(dx = 1.41f, dy = -1.41f)
          // a 12 12 0 0 0 -3.89 -2.6z
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.89f,
            dy1 = -2.6f,
          )
          close()
          // M 26 14
          moveTo(x = 26.0f, y = 14.0f)
          // a 12 12 0 0 0 -0.92 -4.6
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.92f,
            dy1 = -4.6f,
          )
          // l -1.84 0.77
          lineToRelative(dx = -1.84f, dy = 0.77f)
          // A 10 10 0 0 1 24 14z
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 24.0f,
            y1 = 14.0f,
          )
          close()
          // m 4 10
          moveToRelative(dx = 4.0f, dy = 10.0f)
          // a 6 6 0 1 0 -6 6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -6.0f,
            dy1 = 6.0f,
          )
          // a 6 6 0 0 0 6 -6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 6.0f,
            dy1 = -6.0f,
          )
          // m -2 0
          moveToRelative(dx = -2.0f, dy = 0.0f)
          // a 4 4 0 0 1 -0.57 2.02
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.57f,
            dy1 = 2.02f,
          )
          // l -5.45 -5.45
          lineToRelative(dx = -5.45f, dy = -5.45f)
          // A 4 4 0 0 1 24 20
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 24.0f,
            y1 = 20.0f,
          )
          // a 4 4 0 0 1 4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 4.0f,
          )
          // m -8 0
          moveToRelative(dx = -8.0f, dy = 0.0f)
          // a 4 4 0 0 1 0.57 -2.02
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.57f,
            dy1 = -2.02f,
          )
          // l 5.45 5.45
          lineToRelative(dx = 5.45f, dy = 5.45f)
          // A 4 4 0 0 1 24 28
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 24.0f,
            y1 = 28.0f,
          )
          // a 4 4 0 0 1 -4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = -4.0f,
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
      .also { _incompleteError = it }
  }

@Suppress("ObjectPropertyName")
private var _incompleteError: ImageVector? = null
