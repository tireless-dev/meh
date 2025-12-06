// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Firewall: ImageVector
  get() {
    val current = _firewall
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Firewall",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M27 20.4 v3 c-1 0 -2 -1.5 -2 -4 v-3 c-4 5 -5 7 -5 9 a5 5 0 0 0 3.05 4.6 A7.5 7.5 0 0 1 25 26.4 a7.5 7.5 0 0 1 1.95 3.6 A5 5 0 0 0 30 25.4 c0 -2 -1.12 -3.57 -3 -5 M17 28 H4 v-4 h13 v-2 H4 a2 2 0 0 0 -2 2 v4 a2 2 0 0 0 2 2 h13Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27 20.4
          moveTo(x = 27.0f, y = 20.4f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // c -1 0 -2 -1.5 -2 -4
          curveToRelative(
            dx1 = -1.0f,
            dy1 = 0.0f,
            dx2 = -2.0f,
            dy2 = -1.5f,
            dx3 = -2.0f,
            dy3 = -4.0f,
          )
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // c -4 5 -5 7 -5 9
          curveToRelative(
            dx1 = -4.0f,
            dy1 = 5.0f,
            dx2 = -5.0f,
            dy2 = 7.0f,
            dx3 = -5.0f,
            dy3 = 9.0f,
          )
          // a 5 5 0 0 0 3.05 4.6
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.05f,
            dy1 = 4.6f,
          )
          // A 7.5 7.5 0 0 1 25 26.4
          arcTo(
            horizontalEllipseRadius = 7.5f,
            verticalEllipseRadius = 7.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 25.0f,
            y1 = 26.4f,
          )
          // a 7.5 7.5 0 0 1 1.95 3.6
          arcToRelative(
            a = 7.5f,
            b = 7.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.95f,
            dy1 = 3.6f,
          )
          // A 5 5 0 0 0 30 25.4
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 30.0f,
            y1 = 25.4f,
          )
          // c 0 -2 -1.12 -3.57 -3 -5
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -2.0f,
            dx2 = -1.12f,
            dy2 = -3.57f,
            dx3 = -3.0f,
            dy3 = -5.0f,
          )
          // M 17 28
          moveTo(x = 17.0f, y = 28.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 13
          horizontalLineToRelative(dx = 13.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
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
          // h 13z
          horizontalLineToRelative(dx = 13.0f)
          close()
        }
        // M28 12 H7 a2 2 0 0 0 -2 2 v4 a2 2 0 0 0 2 2 h10 v-2 H7 v-4 h21 v2 h2 v-2 a2 2 0 0 0 -2 -2 m-3 -2 H4 a2 2 0 0 1 -2 -2 V4 a2 2 0 0 1 2 -2 h21 a2 2 0 0 1 2 2 v4 a2 2 0 0 1 -2 2 M4 4 v4 h21 V4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 12
          moveTo(x = 28.0f, y = 12.0f)
          // H 7
          horizontalLineTo(x = 7.0f)
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
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 7
          horizontalLineTo(x = 7.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 21
          horizontalLineToRelative(dx = 21.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
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
          // m -3 -2
          moveToRelative(dx = -3.0f, dy = -2.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
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
          // V 4
          verticalLineTo(y = 4.0f)
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
          // h 21
          horizontalLineToRelative(dx = 21.0f)
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
          // M 4 4
          moveTo(x = 4.0f, y = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 21
          horizontalLineToRelative(dx = 21.0f)
          // V 4z
          verticalLineTo(y = 4.0f)
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
      .also { _firewall = it }
  }

@Suppress("ObjectPropertyName")
private var _firewall: ImageVector? = null
