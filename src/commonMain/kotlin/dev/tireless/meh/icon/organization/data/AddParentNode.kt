// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AddParentNode: ImageVector
  get() {
    val current = _addParentNode
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.AddParentNode",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M8 8 H4 V6 h4 V2 h2 v4 h4 v2 h-4 v4 H8z m20 17 a5 5 0 0 1 -9.9 1 H14 a6 6 0 0 1 -6 -6 v-5 h2 v5 a4 4 0 0 0 4 4 h4.1 a5 5 0 0 1 9.9 1 m-2 0 c0 -1.65 -1.35 -3 -3 -3 s-3 1.35 -3 3 1.35 3 3 3 3 -1.35 3 -3
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 8
          moveTo(x = 8.0f, y = 8.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 8z
          horizontalLineTo(x = 8.0f)
          close()
          // m 20 17
          moveToRelative(dx = 20.0f, dy = 17.0f)
          // a 5 5 0 0 1 -9.9 1
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -9.9f,
            dy1 = 1.0f,
          )
          // H 14
          horizontalLineTo(x = 14.0f)
          // a 6 6 0 0 1 -6 -6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -6.0f,
            dy1 = -6.0f,
          )
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // a 4 4 0 0 0 4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.0f,
            dy1 = 4.0f,
          )
          // h 4.1
          horizontalLineToRelative(dx = 4.1f)
          // a 5 5 0 0 1 9.9 1
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 9.9f,
            dy1 = 1.0f,
          )
          // m -2 0
          moveToRelative(dx = -2.0f, dy = 0.0f)
          // c 0 -1.65 -1.35 -3 -3 -3
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -1.65f,
            dx2 = -1.35f,
            dy2 = -3.0f,
            dx3 = -3.0f,
            dy3 = -3.0f,
          )
          // s -3 1.35 -3 3
          reflectiveCurveToRelative(
            dx1 = -3.0f,
            dy1 = 1.35f,
            dx2 = -3.0f,
            dy2 = 3.0f,
          )
          // s 1.35 3 3 3
          reflectiveCurveToRelative(
            dx1 = 1.35f,
            dy1 = 3.0f,
            dx2 = 3.0f,
            dy2 = 3.0f,
          )
          // s 3 -1.35 3 -3
          reflectiveCurveToRelative(
            dx1 = 3.0f,
            dy1 = -1.35f,
            dx2 = 3.0f,
            dy2 = -3.0f,
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
      .also { _addParentNode = it }
  }

@Suppress("ObjectPropertyName")
private var _addParentNode: ImageVector? = null
