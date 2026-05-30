// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LoopAlt: ImageVector
  get() {
    val current = _loopAlt
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LoopAlt",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M15.27 10 v9.99 H20 V22 h-7 V10z M23 25 h3.75 A7 7 0 0 1 21 28 H11 c-3.9 0 -7 -3.1 -7 -7 v-8 H2 v8 c0 5 4 9 9 9 h10 a9 9 0 0 0 7 -3.35 V30 h2 v-7 h-7z M21 2 H11 a9 9 0 0 0 -7 3.35 V2 H2 v7 h7 V7 H5.25 A7 7 0 0 1 11 4 h10 c3.9 0 7 3.1 7 7 v8 h2 v-8 c0 -5 -4 -9 -9 -9
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15.27 10
          moveTo(x = 15.27f, y = 10.0f)
          // v 9.99
          verticalLineToRelative(dy = 9.99f)
          // H 20
          horizontalLineTo(x = 20.0f)
          // V 22
          verticalLineTo(y = 22.0f)
          // h -7
          horizontalLineToRelative(dx = -7.0f)
          // V 10z
          verticalLineTo(y = 10.0f)
          close()
          // M 23 25
          moveTo(x = 23.0f, y = 25.0f)
          // h 3.75
          horizontalLineToRelative(dx = 3.75f)
          // A 7 7 0 0 1 21 28
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 21.0f,
            y1 = 28.0f,
          )
          // H 11
          horizontalLineTo(x = 11.0f)
          // c -3.9 0 -7 -3.1 -7 -7
          curveToRelative(
            dx1 = -3.9f,
            dy1 = 0.0f,
            dx2 = -7.0f,
            dy2 = -3.1f,
            dx3 = -7.0f,
            dy3 = -7.0f,
          )
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // c 0 5 4 9 9 9
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 5.0f,
            dx2 = 4.0f,
            dy2 = 9.0f,
            dx3 = 9.0f,
            dy3 = 9.0f,
          )
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // a 9 9 0 0 0 7 -3.35
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 7.0f,
            dy1 = -3.35f,
          )
          // V 30
          verticalLineTo(y = 30.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -7
          verticalLineToRelative(dy = -7.0f)
          // h -7z
          horizontalLineToRelative(dx = -7.0f)
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
      .also { _loopAlt = it }
  }

@Suppress("ObjectPropertyName")
private var _loopAlt: ImageVector? = null
