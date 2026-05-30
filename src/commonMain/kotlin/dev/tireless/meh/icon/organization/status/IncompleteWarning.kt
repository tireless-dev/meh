// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val IncompleteWarning: ImageVector
  get() {
    val current = _incompleteWarning
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.IncompleteWarning",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M14 26 a12 12 0 0 1 0 -24Z m3.83 -21.24 a10 10 0 0 1 3.24 2.17 l1.41 -1.41 a12 12 0 0 0 -3.89 -2.6Z M26 14 a12 12 0 0 0 -.92 -4.6 l-1.84 .77 A10 10 0 0 1 24 14Z m1.38 14 h-6.76 L24 21.24Z M24 18 a1 1 0 0 0 -.9 .55 l-5 10 A1 1 0 0 0 19 30 h10 a1 1 0 0 0 .92 -1.39 L24.9 18.55 A1 1 0 0 0 24 18
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
          // m 1.38 14
          moveToRelative(dx = 1.38f, dy = 14.0f)
          // h -6.76
          horizontalLineToRelative(dx = -6.76f)
          // L 24 21.24z
          lineTo(x = 24.0f, y = 21.24f)
          close()
          // M 24 18
          moveTo(x = 24.0f, y = 18.0f)
          // a 1 1 0 0 0 -0.9 0.55
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.9f,
            dy1 = 0.55f,
          )
          // l -5 10
          lineToRelative(dx = -5.0f, dy = 10.0f)
          // A 1 1 0 0 0 19 30
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 19.0f,
            y1 = 30.0f,
          )
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // a 1 1 0 0 0 0.92 -1.39
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.92f,
            dy1 = -1.39f,
          )
          // L 24.9 18.55
          lineTo(x = 24.9f, y = 18.55f)
          // A 1 1 0 0 0 24 18
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 24.0f,
            y1 = 18.0f,
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
      .also { _incompleteWarning = it }
  }

@Suppress("ObjectPropertyName")
private var _incompleteWarning: ImageVector? = null
