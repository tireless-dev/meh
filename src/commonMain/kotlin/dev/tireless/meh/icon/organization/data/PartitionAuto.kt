// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PartitionAuto: ImageVector
  get() {
    val current = _partitionAuto
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.PartitionAuto",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 19 a4 4 0 0 0 -4 4 4 4 0 0 0 .5 1.88 A10.99 10.99 0 0 1 5 16 H3 a13.01 13.01 0 0 0 20.84 10.36 A4 4 0 1 0 26 19 m0 6 a2 2 0 1 1 0 -4 2 2 0 0 1 0 4 M16 3 c-2.85 0 -5.6 .94 -7.84 2.64 A4 4 0 1 0 10 9 a4 4 0 0 0 -.5 -1.88 A10.99 10.99 0 0 1 27 16 h2 c0 -7.17 -5.83 -13 -13 -13 M6 11 a2 2 0 1 1 0 -4 2 2 0 0 1 0 4
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 19
          moveTo(x = 26.0f, y = 19.0f)
          // a 4 4 0 0 0 -4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.0f,
            dy1 = 4.0f,
          )
          // a 4 4 0 0 0 0.5 1.88
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.5f,
            dy1 = 1.88f,
          )
          // A 10.99 10.99 0 0 1 5 16
          arcTo(
            horizontalEllipseRadius = 10.99f,
            verticalEllipseRadius = 10.99f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 5.0f,
            y1 = 16.0f,
          )
          // H 3
          horizontalLineTo(x = 3.0f)
          // a 13.01 13.01 0 0 0 20.84 10.36
          arcToRelative(
            a = 13.01f,
            b = 13.01f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 20.84f,
            dy1 = 10.36f,
          )
          // A 4 4 0 1 0 26 19
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 26.0f,
            y1 = 19.0f,
          )
          // m 0 6
          moveToRelative(dx = 0.0f, dy = 6.0f)
          // a 2 2 0 1 1 0 -4
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -4.0f,
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
          // M 16 3
          moveTo(x = 16.0f, y = 3.0f)
          // c -2.85 0 -5.6 0.94 -7.84 2.64
          curveToRelative(
            dx1 = -2.85f,
            dy1 = 0.0f,
            dx2 = -5.6f,
            dy2 = 0.94f,
            dx3 = -7.84f,
            dy3 = 2.64f,
          )
          // A 4 4 0 1 0 10 9
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 10.0f,
            y1 = 9.0f,
          )
          // a 4 4 0 0 0 -0.5 -1.88
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.5f,
            dy1 = -1.88f,
          )
          // A 10.99 10.99 0 0 1 27 16
          arcTo(
            horizontalEllipseRadius = 10.99f,
            verticalEllipseRadius = 10.99f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 27.0f,
            y1 = 16.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // c 0 -7.17 -5.83 -13 -13 -13
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -7.17f,
            dx2 = -5.83f,
            dy2 = -13.0f,
            dx3 = -13.0f,
            dy3 = -13.0f,
          )
          // M 6 11
          moveTo(x = 6.0f, y = 11.0f)
          // a 2 2 0 1 1 0 -4
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -4.0f,
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
      .also { _partitionAuto = it }
  }

@Suppress("ObjectPropertyName")
private var _partitionAuto: ImageVector? = null
