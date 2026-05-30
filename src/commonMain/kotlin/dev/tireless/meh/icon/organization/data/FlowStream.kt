// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FlowStream: ImageVector
  get() {
    val current = _flowStream
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.FlowStream",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M20 24 h-8.14 a4 4 0 0 0 -.43 -1.02 l10.55 -10.55 A4 4 0 1 0 20.14 8 H14 v2 h6.14 a4 4 0 0 0 .43 1.02 L10.02 21.57 A4 4 0 1 0 11.86 26 H20 v3 h8 v-8 h-8Z m4 -17 a2 2 0 1 1 -2 2 2 2 0 0 1 2 -2 M8 27 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2 m14 -4 h4 v4 h-4Z
        path(
          fill = SolidColor(Color(0xFF090909)),
        ) {
          // M 20 24
          moveTo(x = 20.0f, y = 24.0f)
          // h -8.14
          horizontalLineToRelative(dx = -8.14f)
          // a 4 4 0 0 0 -0.43 -1.02
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.43f,
            dy1 = -1.02f,
          )
          // l 10.55 -10.55
          lineToRelative(dx = 10.55f, dy = -10.55f)
          // A 4 4 0 1 0 20.14 8
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 20.14f,
            y1 = 8.0f,
          )
          // H 14
          horizontalLineTo(x = 14.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 6.14
          horizontalLineToRelative(dx = 6.14f)
          // a 4 4 0 0 0 0.43 1.02
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.43f,
            dy1 = 1.02f,
          )
          // L 10.02 21.57
          lineTo(x = 10.02f, y = 21.57f)
          // A 4 4 0 1 0 11.86 26
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 11.86f,
            y1 = 26.0f,
          )
          // H 20
          horizontalLineTo(x = 20.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
          close()
          // m 4 -17
          moveToRelative(dx = 4.0f, dy = -17.0f)
          // a 2 2 0 1 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
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
          // M 8 27
          moveTo(x = 8.0f, y = 27.0f)
          // a 2 2 0 1 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
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
          // m 14 -4
          moveToRelative(dx = 14.0f, dy = -4.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // M9.7 12.75 a5 5 0 0 1 0 -7.5 l1.32 1.5 a3 3 0 0 0 0 4.5Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9.7 12.75
          moveTo(x = 9.7f, y = 12.75f)
          // a 5 5 0 0 1 0 -7.5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -7.5f,
          )
          // l 1.32 1.5
          lineToRelative(dx = 1.32f, dy = 1.5f)
          // a 3 3 0 0 0 0 4.5z
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 4.5f,
          )
          close()
        }
        // M7.05 15.75 a9 9 0 0 1 0 -13.5 l1.32 1.5 a7 7 0 0 0 0 10.5Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7.05 15.75
          moveTo(x = 7.05f, y = 15.75f)
          // a 9 9 0 0 1 0 -13.5
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -13.5f,
          )
          // l 1.32 1.5
          lineToRelative(dx = 1.32f, dy = 1.5f)
          // a 7 7 0 0 0 0 10.5z
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 10.5f,
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
      .also { _flowStream = it }
  }

@Suppress("ObjectPropertyName")
private var _flowStream: ImageVector? = null
