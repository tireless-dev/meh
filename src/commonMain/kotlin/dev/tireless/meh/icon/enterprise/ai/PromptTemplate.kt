// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.ai

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PromptTemplate: ImageVector
  get() {
    val current = _promptTemplate
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.PromptTemplate",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M31.5 23 a1.5 1.5 0 0 1 -1.5 -1.5 V20 a2 2 0 0 0 -2 -2 h-2 v2 h2 v1.5 c0 .98 .4 1.86 1.06 2.5 A3.5 3.5 0 0 0 28 26.5 V28 h-2 v2 h2 a2 2 0 0 0 2 -2 v-1.5 a1.5 1.5 0 0 1 1.5 -1.5 H32 v-2z M16 20 v1.5 a1.5 1.5 0 0 1 -1.5 1.5 H14 v2 h.5 a1.5 1.5 0 0 1 1.5 1.5 V28 a2 2 0 0 0 2 2 h2 v-2 h-2 v-1.5 c0 -.98 -.4 -1.86 -1.06 -2.5 A3.5 3.5 0 0 0 18 21.5 V20 h2 v-2 h-2 a2 2 0 0 0 -2 2 m12 -5 h2 V5 a2 2 0 0 0 -2 -2 h-3 v2 h3z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 31.5 23
          moveTo(x = 31.5f, y = 23.0f)
          // a 1.5 1.5 0 0 1 -1.5 -1.5
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.5f,
            dy1 = -1.5f,
          )
          // V 20
          verticalLineTo(y = 20.0f)
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
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 1.5
          verticalLineToRelative(dy = 1.5f)
          // c 0 0.98 0.4 1.86 1.06 2.5
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.98f,
            dx2 = 0.4f,
            dy2 = 1.86f,
            dx3 = 1.06f,
            dy3 = 2.5f,
          )
          // A 3.5 3.5 0 0 0 28 26.5
          arcTo(
            horizontalEllipseRadius = 3.5f,
            verticalEllipseRadius = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 28.0f,
            y1 = 26.5f,
          )
          // V 28
          verticalLineTo(y = 28.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
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
          // v -1.5
          verticalLineToRelative(dy = -1.5f)
          // a 1.5 1.5 0 0 1 1.5 -1.5
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.5f,
            dy1 = -1.5f,
          )
          // H 32
          horizontalLineTo(x = 32.0f)
          // v -2z
          verticalLineToRelative(dy = -2.0f)
          close()
          // M 16 20
          moveTo(x = 16.0f, y = 20.0f)
          // v 1.5
          verticalLineToRelative(dy = 1.5f)
          // a 1.5 1.5 0 0 1 -1.5 1.5
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.5f,
            dy1 = 1.5f,
          )
          // H 14
          horizontalLineTo(x = 14.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 0.5
          horizontalLineToRelative(dx = 0.5f)
          // a 1.5 1.5 0 0 1 1.5 1.5
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.5f,
            dy1 = 1.5f,
          )
          // V 28
          verticalLineTo(y = 28.0f)
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
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -1.5
          verticalLineToRelative(dy = -1.5f)
          // c 0 -0.98 -0.4 -1.86 -1.06 -2.5
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.98f,
            dx2 = -0.4f,
            dy2 = -1.86f,
            dx3 = -1.06f,
            dy3 = -2.5f,
          )
          // A 3.5 3.5 0 0 0 18 21.5
          arcTo(
            horizontalEllipseRadius = 3.5f,
            verticalEllipseRadius = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 18.0f,
            y1 = 21.5f,
          )
          // V 20
          verticalLineTo(y = 20.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
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
          // m 12 -5
          moveToRelative(dx = 12.0f, dy = -5.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 5
          verticalLineTo(y = 5.0f)
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
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 3z
          horizontalLineToRelative(dx = 3.0f)
          close()
        }
        // <circle cx="23.0" cy="13.0" radius="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 13
          moveTo(x = 23.0f, y = 13.0f)
          // m -2 0
          moveToRelative(dx = -2.0f, dy = 0.0f)
          // a 2 2 0 1 1 4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 0.0f,
          )
          // a 2 2 0 1 1 -4 0z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // <circle cx="16.0" cy="13.0" radius="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 13
          moveTo(x = 16.0f, y = 13.0f)
          // m -2 0
          moveToRelative(dx = -2.0f, dy = 0.0f)
          // a 2 2 0 1 1 4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 0.0f,
          )
          // a 2 2 0 1 1 -4 0z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // <circle cx="9.0" cy="13.0" radius="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9 13
          moveTo(x = 9.0f, y = 13.0f)
          // m -2 0
          moveToRelative(dx = -2.0f, dy = 0.0f)
          // a 2 2 0 1 1 4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 0.0f,
          )
          // a 2 2 0 1 1 -4 0z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // M7 23 H4 a2 2 0 0 1 -2 -2 V5 a2 2 0 0 1 2 -2 h3 v2 H4 v16 h3z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7 23
          moveTo(x = 7.0f, y = 23.0f)
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
          // V 5
          verticalLineTo(y = 5.0f)
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
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
        // H 4
        horizontalLineTo(x = 4.0f)
        // v 16
        verticalLineToRelative(dy = 16.0f)
        // h 3z
        horizontalLineToRelative(dx = 3.0f)
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
      .also { _promptTemplate = it }
  }

@Suppress("ObjectPropertyName")
private var _promptTemplate: ImageVector? = null
