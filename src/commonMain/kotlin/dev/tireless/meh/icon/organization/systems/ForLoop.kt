// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ForLoop: ImageVector
  get() {
    val current = _forLoop
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ForLoop",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M23 23 h7 v7 h-2 v-3.35 A9 9 0 0 1 21 30 H11 c-5 0 -9 -4 -9 -9 v-8 h2 v8 c0 3.9 3.1 7 7 7 h10 c2.4 0 4.5 -1.18 5.75 -3 H23z M21 2 H11 a9 9 0 0 0 -7 3.35 V2 H2 v7 h7 V7 H5.25 A7 7 0 0 1 11 4 h10 c3.9 0 7 3.1 7 7 v8 h2 v-8 c0 -5 -4 -9 -9 -9 m-.28 10.01 V10 H13 v12 h2.27 v-5.07 h4.75 v-2.01 h-4.75 v-2.9z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 23
          moveTo(x = 23.0f, y = 23.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -3.35
          verticalLineToRelative(dy = -3.35f)
          // A 9 9 0 0 1 21 30
          arcTo(
            horizontalEllipseRadius = 9.0f,
            verticalEllipseRadius = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 21.0f,
            y1 = 30.0f,
          )
          // H 11
          horizontalLineTo(x = 11.0f)
          // c -5 0 -9 -4 -9 -9
          curveToRelative(
            dx1 = -5.0f,
            dy1 = 0.0f,
            dx2 = -9.0f,
            dy2 = -4.0f,
            dx3 = -9.0f,
            dy3 = -9.0f,
          )
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // c 0 3.9 3.1 7 7 7
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 3.9f,
            dx2 = 3.1f,
            dy2 = 7.0f,
            dx3 = 7.0f,
            dy3 = 7.0f,
          )
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // c 2.4 0 4.5 -1.18 5.75 -3
          curveToRelative(
            dx1 = 2.4f,
            dy1 = 0.0f,
            dx2 = 4.5f,
            dy2 = -1.18f,
            dx3 = 5.75f,
            dy3 = -3.0f,
          )
          // H 23z
          horizontalLineTo(x = 23.0f)
          close()
          // M 21 2
          moveTo(x = 21.0f, y = 2.0f)
          // H 11
          horizontalLineTo(x = 11.0f)
          // a 9 9 0 0 0 -7 3.35
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.0f,
            dy1 = 3.35f,
          )
          // V 2
          verticalLineTo(y = 2.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // V 7
          verticalLineTo(y = 7.0f)
          // H 5.25
          horizontalLineTo(x = 5.25f)
          // A 7 7 0 0 1 11 4
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 11.0f,
            y1 = 4.0f,
          )
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // c 3.9 0 7 3.1 7 7
          curveToRelative(
            dx1 = 3.9f,
            dy1 = 0.0f,
            dx2 = 7.0f,
            dy2 = 3.1f,
            dx3 = 7.0f,
            dy3 = 7.0f,
          )
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // c 0 -5 -4 -9 -9 -9
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -5.0f,
            dx2 = -4.0f,
            dy2 = -9.0f,
            dx3 = -9.0f,
            dy3 = -9.0f,
          )
          // m -0.28 10.01
          moveToRelative(dx = -0.28f, dy = 10.01f)
          // V 10
          verticalLineTo(y = 10.0f)
          // H 13
          horizontalLineTo(x = 13.0f)
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // h 2.27
          horizontalLineToRelative(dx = 2.27f)
          // v -5.07
          verticalLineToRelative(dy = -5.07f)
          // h 4.75
          horizontalLineToRelative(dx = 4.75f)
          // v -2.01
          verticalLineToRelative(dy = -2.01f)
          // h -4.75
          horizontalLineToRelative(dx = -4.75f)
          // v -2.9z
          verticalLineToRelative(dy = -2.9f)
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
      .also { _forLoop = it }
  }

@Suppress("ObjectPropertyName")
private var _forLoop: ImageVector? = null
