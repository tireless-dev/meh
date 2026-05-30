// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Subflow: ImageVector
  get() {
    val current = _subflow
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Subflow",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 30 A14 14 0 0 1 2 16 h2 a12 12 0 0 0 18.46 10.11 l1.08 1.69 A14 14 0 0 1 16 30
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 30
          moveTo(x = 16.0f, y = 30.0f)
          // A 14 14 0 0 1 2 16
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 2.0f,
            y1 = 16.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 12 12 0 0 0 18.46 10.11
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 18.46f,
            dy1 = 10.11f,
          )
          // l 1.08 1.69
          lineToRelative(dx = 1.08f, dy = 1.69f)
          // A 14 14 0 0 1 16 30
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 30.0f,
          )
        }
        // m26 17 -1.41 1.41 L26.17 20 H15.82 a3 3 0 0 0 -.28 -.58 l4.48 -5.6 A3 3 0 0 0 21 14 a3 3 0 1 0 -2.82 -4 h-4.36 a2.98 2.98 0 0 0 -5.64 0 H2 v2 h6.18 a2.98 2.98 0 0 0 5.64 0 h4.36 a3 3 0 0 0 .28 .58 l-4.48 5.6 A3 3 0 0 0 13 18 a3 3 0 1 0 2.82 4 h10.35 l-1.58 1.59 L26 25 l4 -4Z m-5 -7 a1 1 0 1 1 -1 1 1 1 0 0 1 1 -1 m-10 2 a1 1 0 1 1 1 -1 1 1 0 0 1 -1 1 m2 10 a1 1 0 1 1 1 -1 1 1 0 0 1 -1 1
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 17
          moveTo(x = 26.0f, y = 17.0f)
          // l -1.41 1.41
          lineToRelative(dx = -1.41f, dy = 1.41f)
          // L 26.17 20
          lineTo(x = 26.17f, y = 20.0f)
          // H 15.82
          horizontalLineTo(x = 15.82f)
          // a 3 3 0 0 0 -0.28 -0.58
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.28f,
            dy1 = -0.58f,
          )
          // l 4.48 -5.6
          lineToRelative(dx = 4.48f, dy = -5.6f)
          // A 3 3 0 0 0 21 14
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 21.0f,
            y1 = 14.0f,
          )
          // a 3 3 0 1 0 -2.82 -4
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -2.82f,
            dy1 = -4.0f,
          )
          // h -4.36
          horizontalLineToRelative(dx = -4.36f)
          // a 2.98 2.98 0 0 0 -5.64 0
          arcToRelative(
            a = 2.98f,
            b = 2.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.64f,
            dy1 = 0.0f,
          )
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 6.18
          horizontalLineToRelative(dx = 6.18f)
          // a 2.98 2.98 0 0 0 5.64 0
          arcToRelative(
            a = 2.98f,
            b = 2.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.64f,
            dy1 = 0.0f,
          )
          // h 4.36
          horizontalLineToRelative(dx = 4.36f)
          // a 3 3 0 0 0 0.28 0.58
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.28f,
            dy1 = 0.58f,
          )
          // l -4.48 5.6
          lineToRelative(dx = -4.48f, dy = 5.6f)
          // A 3 3 0 0 0 13 18
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 13.0f,
            y1 = 18.0f,
          )
          // a 3 3 0 1 0 2.82 4
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 2.82f,
            dy1 = 4.0f,
          )
          // h 10.35
          horizontalLineToRelative(dx = 10.35f)
          // l -1.58 1.59
          lineToRelative(dx = -1.58f, dy = 1.59f)
          // L 26 25
          lineTo(x = 26.0f, y = 25.0f)
          // l 4 -4z
          lineToRelative(dx = 4.0f, dy = -4.0f)
          close()
          // m -5 -7
          moveToRelative(dx = -5.0f, dy = -7.0f)
          // a 1 1 0 1 1 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // a 1 1 0 0 1 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // m -10 2
          moveToRelative(dx = -10.0f, dy = 2.0f)
          // a 1 1 0 1 1 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // a 1 1 0 0 1 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // m 2 10
          moveToRelative(dx = 2.0f, dy = 10.0f)
          // a 1 1 0 1 1 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // a 1 1 0 0 1 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
        }
        // M30 16 h-2 A12 12 0 0 0 9.54 5.89 L8.46 4.2 A14 14 0 0 1 30 16
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 16
          moveTo(x = 30.0f, y = 16.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // A 12 12 0 0 0 9.54 5.89
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 9.54f,
            y1 = 5.89f,
          )
          // L 8.46 4.2
          lineTo(x = 8.46f, y = 4.2f)
          // A 14 14 0 0 1 30 16
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 30.0f,
            y1 = 16.0f,
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
      .also { _subflow = it }
  }

@Suppress("ObjectPropertyName")
private var _subflow: ImageVector? = null
