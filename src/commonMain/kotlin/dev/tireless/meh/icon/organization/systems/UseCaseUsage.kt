// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UseCaseUsage: ImageVector
  get() {
    val current = _useCaseUsage
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.UseCaseUsage",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M22.07 22 c1.71 0 2.94 -.79 3.52 -2.34 l-1.66 -.8 c-.32 .8 -.83 1.4 -1.86 1.4 -1.2 0 -1.8 -.84 -1.8 -2.07 v-1.6 c0 -1.24 .6 -2.08 1.8 -2.08 a1.65 1.65 0 0 1 1.7 1.28 l1.77 -.8 c-.53 -1.38 -1.7 -2.23 -3.47 -2.23 -2.6 0 -4.07 1.78 -4.07 4.6 C18 20.2 19.47 22 22.07 22 m-10.56 0 c3.32 0 4.55 -1.58 4.55 -5.04 V9.99 h-2.2 v7.25 c0 1.85 -.64 2.77 -2.33 2.77 S9.2 19.1 9.2 17.24 V10 H7 v6.97 c0 3.46 1.2 5.03 4.51 5.03
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22.07 22
          moveTo(x = 22.07f, y = 22.0f)
          // c 1.71 0 2.94 -0.79 3.52 -2.34
          curveToRelative(
            dx1 = 1.71f,
            dy1 = 0.0f,
            dx2 = 2.94f,
            dy2 = -0.79f,
            dx3 = 3.52f,
            dy3 = -2.34f,
          )
          // l -1.66 -0.8
          lineToRelative(dx = -1.66f, dy = -0.8f)
          // c -0.32 0.8 -0.83 1.4 -1.86 1.4
          curveToRelative(
            dx1 = -0.32f,
            dy1 = 0.8f,
            dx2 = -0.83f,
            dy2 = 1.4f,
            dx3 = -1.86f,
            dy3 = 1.4f,
          )
          // c -1.2 0 -1.8 -0.84 -1.8 -2.07
          curveToRelative(
            dx1 = -1.2f,
            dy1 = 0.0f,
            dx2 = -1.8f,
            dy2 = -0.84f,
            dx3 = -1.8f,
            dy3 = -2.07f,
          )
          // v -1.6
          verticalLineToRelative(dy = -1.6f)
          // c 0 -1.24 0.6 -2.08 1.8 -2.08
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -1.24f,
            dx2 = 0.6f,
            dy2 = -2.08f,
            dx3 = 1.8f,
            dy3 = -2.08f,
          )
          // a 1.65 1.65 0 0 1 1.7 1.28
          arcToRelative(
            a = 1.65f,
            b = 1.65f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.7f,
            dy1 = 1.28f,
          )
          // l 1.77 -0.8
          lineToRelative(dx = 1.77f, dy = -0.8f)
          // c -0.53 -1.38 -1.7 -2.23 -3.47 -2.23
          curveToRelative(
            dx1 = -0.53f,
            dy1 = -1.38f,
            dx2 = -1.7f,
            dy2 = -2.23f,
            dx3 = -3.47f,
            dy3 = -2.23f,
          )
          // c -2.6 0 -4.07 1.78 -4.07 4.6
          curveToRelative(
            dx1 = -2.6f,
            dy1 = 0.0f,
            dx2 = -4.07f,
            dy2 = 1.78f,
            dx3 = -4.07f,
            dy3 = 4.6f,
          )
          // C 18 20.2 19.47 22 22.07 22
          curveTo(
            x1 = 18.0f,
            y1 = 20.2f,
            x2 = 19.47f,
            y2 = 22.0f,
            x3 = 22.07f,
            y3 = 22.0f,
          )
          // m -10.56 0
          moveToRelative(dx = -10.56f, dy = 0.0f)
          // c 3.32 0 4.55 -1.58 4.55 -5.04
          curveToRelative(
            dx1 = 3.32f,
            dy1 = 0.0f,
            dx2 = 4.55f,
            dy2 = -1.58f,
            dx3 = 4.55f,
            dy3 = -5.04f,
          )
          // V 9.99
          verticalLineTo(y = 9.99f)
          // h -2.2
          horizontalLineToRelative(dx = -2.2f)
          // v 7.25
          verticalLineToRelative(dy = 7.25f)
          // c 0 1.85 -0.64 2.77 -2.33 2.77
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 1.85f,
            dx2 = -0.64f,
            dy2 = 2.77f,
            dx3 = -2.33f,
            dy3 = 2.77f,
          )
          // S 9.2 19.1 9.2 17.24
          reflectiveCurveTo(
            x1 = 9.2f,
            y1 = 19.1f,
            x2 = 9.2f,
            y2 = 17.24f,
          )
          // V 10
          verticalLineTo(y = 10.0f)
          // H 7
          horizontalLineTo(x = 7.0f)
          // v 6.97
          verticalLineToRelative(dy = 6.97f)
          // c 0 3.46 1.2 5.03 4.51 5.03
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 3.46f,
            dx2 = 1.2f,
            dy2 = 5.03f,
            dx3 = 4.51f,
            dy3 = 5.03f,
          )
        }
        // M21 30 H11 c-4.96 0 -9 -4.04 -9 -9 V11 c0 -4.96 4.04 -9 9 -9 h10 c4.96 0 9 4.04 9 9 v10 c0 4.96 -4.04 9 -9 9 M11 4 a7 7 0 0 0 -7 7 v10 a7 7 0 0 0 7 7 h10 a7 7 0 0 0 7 -7 V11 a7 7 0 0 0 -7 -7z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 30
          moveTo(x = 21.0f, y = 30.0f)
          // H 11
          horizontalLineTo(x = 11.0f)
          // c -4.96 0 -9 -4.04 -9 -9
          curveToRelative(
            dx1 = -4.96f,
            dy1 = 0.0f,
            dx2 = -9.0f,
            dy2 = -4.04f,
            dx3 = -9.0f,
            dy3 = -9.0f,
          )
          // V 11
          verticalLineTo(y = 11.0f)
          // c 0 -4.96 4.04 -9 9 -9
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -4.96f,
            dx2 = 4.04f,
            dy2 = -9.0f,
            dx3 = 9.0f,
            dy3 = -9.0f,
          )
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // c 4.96 0 9 4.04 9 9
          curveToRelative(
            dx1 = 4.96f,
            dy1 = 0.0f,
            dx2 = 9.0f,
            dy2 = 4.04f,
            dx3 = 9.0f,
            dy3 = 9.0f,
          )
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // c 0 4.96 -4.04 9 -9 9
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 4.96f,
            dx2 = -4.04f,
            dy2 = 9.0f,
            dx3 = -9.0f,
            dy3 = 9.0f,
          )
          // M 11 4
          moveTo(x = 11.0f, y = 4.0f)
          // a 7 7 0 0 0 -7 7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.0f,
            dy1 = 7.0f,
          )
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // a 7 7 0 0 0 7 7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 7.0f,
            dy1 = 7.0f,
          )
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // a 7 7 0 0 0 7 -7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 7.0f,
            dy1 = -7.0f,
          )
          // V 11
          verticalLineTo(y = 11.0f)
          // a 7 7 0 0 0 -7 -7z
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.0f,
            dy1 = -7.0f,
          )
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
      path(
        fill = SolidColor(Color.Transparent),
        strokeLineWidth = 0.0f,
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
      .also { _useCaseUsage = it }
  }

@Suppress("ObjectPropertyName")
private var _useCaseUsage: ImageVector? = null
