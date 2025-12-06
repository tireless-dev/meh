// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Legend: ImageVector
  get() {
    val current = _legend
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Legend",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="14" height="2" x="16.0" y="22.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 22
          moveTo(x = 16.0f, y = 22.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -14z
          horizontalLineToRelative(dx = -14.0f)
          close()
        }
        // <rect width="6" height="6" rx="1.0" x="4.0" y="20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 21
          moveTo(x = 4.0f, y = 21.0f)
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
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // a 1 1 0 0 1 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // v 4
          verticalLineToRelative(dy = 4.0f)
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
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // a 1 1 0 0 1 -1 -1z
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          close()
        }
        // <rect width="14" height="2" x="16.0" y="8.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 8
          moveTo(x = 16.0f, y = 8.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -14z
          horizontalLineToRelative(dx = -14.0f)
          close()
        }
        // M9.5 12 h-5 a.5 .5 0 0 1 -.45 -.72 l2.5 -5.03 a.52 .52 0 0 1 .9 0 l2.5 5.03 A.5 .5 0 0 1 9.5 12
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9.5 12
          moveTo(x = 9.5f, y = 12.0f)
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // a 0.5 0.5 0 0 1 -0.45 -0.72
          arcToRelative(
            a = 0.5f,
            b = 0.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.45f,
            dy1 = -0.72f,
          )
          // l 2.5 -5.03
          lineToRelative(dx = 2.5f, dy = -5.03f)
          // a 0.52 0.52 0 0 1 0.9 0
          arcToRelative(
            a = 0.52f,
            b = 0.52f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.9f,
            dy1 = 0.0f,
          )
          // l 2.5 5.03
          lineToRelative(dx = 2.5f, dy = 5.03f)
          // A 0.5 0.5 0 0 1 9.5 12
          arcTo(
            horizontalEllipseRadius = 0.5f,
            verticalEllipseRadius = 0.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 9.5f,
            y1 = 12.0f,
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
      .also { _legend = it }
  }

@Suppress("ObjectPropertyName")
private var _legend: ImageVector? = null
